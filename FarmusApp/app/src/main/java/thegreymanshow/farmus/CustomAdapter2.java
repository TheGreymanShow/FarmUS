package thegreymanshow.farmus;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
//import com.google.android.gms.vision.text.Text;

import java.util.List;

/**
 * Created by Parth on 1/29/2017.
 */

public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.ViewHolder>{

    private Context context;
    private List<Mydata2> my_data;

    public CustomAdapter2(FragmentActivity activity, List<Mydata2> data_list) {
        this.context = activity;
        this.my_data = data_list;
    }

    @Override
    public CustomAdapter2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row,parent,false);

        return new CustomAdapter2.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomAdapter2.ViewHolder holder, int position) {
        holder.name.setText(my_data.get(position).getName());
        holder.description.setText(my_data.get(position).getDescription());
        holder.reference.setText(my_data.get(position).getReference());
    }

    @Override
    public int getItemCount() {
        return my_data.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{

        public TextView name;
        public TextView description;
        public TextView reference;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            description = (TextView) itemView.findViewById(R.id.description);
            reference = (TextView) itemView.findViewById(R.id.references);
        }

    }



}
