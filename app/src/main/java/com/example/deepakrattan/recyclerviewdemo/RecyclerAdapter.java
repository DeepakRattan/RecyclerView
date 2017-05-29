package com.example.deepakrattan.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Deepak Rattan on 29-May-17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<SingleRow> singleRowArrayList;

    public RecyclerAdapter(Context context, ArrayList<SingleRow> singleRowArrayList) {
        this.context = context;
        this.singleRowArrayList = singleRowArrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        SingleRow singleRow = singleRowArrayList.get(position);
        holder.txtTitle.setText(singleRow.getTitle());
        holder.txtDesc.setText(singleRow.getDesc());
        holder.img.setImageResource(R.drawable.pic);

    }

    @Override
    public int getItemCount() {
        return singleRowArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txtTitle,txtDesc;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            txtDesc = (TextView) itemView.findViewById(R.id.txtDesc);
            img= (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
