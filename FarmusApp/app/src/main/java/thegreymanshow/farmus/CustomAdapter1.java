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

import java.util.List;

/**
 * Created by Akshay on 1/29/2017.
 */
public class CustomAdapter1 extends RecyclerView.Adapter<CustomAdapter1.ViewHolder> {

    private Context context;
    private List<Mydata> my_data;

    public CustomAdapter1(FragmentActivity activity, List<Mydata> data_list) {
        this.context = activity;
        this.my_data = data_list;
    }

    @Override
    public CustomAdapter1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomAdapter1.ViewHolder holder, int position) {

        holder.description.setText(my_data.get(position).getDescription());
        Glide.with(context).load(my_data.get(position).getImage()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return my_data.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{

        public TextView description;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            description = (TextView) itemView.findViewById(R.id.description);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }


}
