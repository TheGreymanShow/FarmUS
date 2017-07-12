package thegreymanshow.farmus;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabB extends Fragment {


    private RecyclerView recyclerview;
    private GridLayoutManager gridLayoutManager;
    private CustomAdapter1 adapter;
    private List<Mydata> data_list;


    public TabB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_tab_b, container, false);

        recyclerview = (RecyclerView) view.findViewById(R.id.recycler_view);
        data_list = new ArrayList<>();

        load_data_from_server(0);

        gridLayoutManager = new GridLayoutManager(getActivity(),1);
        recyclerview.setLayoutManager(gridLayoutManager);

        adapter = new CustomAdapter1(getActivity(),data_list);
        recyclerview.setAdapter(adapter);

        recyclerview.addOnScrollListener(new RecyclerView.OnScrollListener(){

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if(gridLayoutManager.findLastCompletelyVisibleItemPosition() == data_list.size()-1)
                {
                    load_data_from_server(data_list.get(data_list.size()-1).getId());
                }
            }
        });

        return view;
    }

    private void load_data_from_server(final int id) {

        AsyncTask<Integer,Void,Void> task = new AsyncTask<Integer, Void, Void>() {
            @Override
            protected Void doInBackground(Integer... params) {

                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder().url("http://192.168.1.3/farmus/Admin_form/script.php?id="+id).build();

                try {
                    Response response = client.newCall(request).execute();

                    JSONArray array = new JSONArray(response.body().string());

                    for(int i=0;i<array.length();i++) {

                        JSONObject object = array.getJSONObject(i);
                        Mydata data = new Mydata(object.getInt("id"),object.getString("description"),object.getString("image"));
                        Log.w("JSON", String.valueOf(object.getInt("id")));
                        Log.w("JSON", object.getString("description"));
                        Log.w("JSON", object.getString("image"));
                        data_list.add(data);
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    System.out.print("End of content");
                }

                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                adapter.notifyDataSetChanged();
            }
        };

        task.execute(id);

    }


}
