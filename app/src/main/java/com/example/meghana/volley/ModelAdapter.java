package com.example.meghana.volley;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Response;
import com.squareup.picasso.Picasso;

import org.json.JSONObject;

import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.MyViewHolder>{
    List<Model> list;
    Context context;

     ModelAdapter(List<Model> list, Context context) {
        this.list = list;
        this.context =  context;
    }


    @NonNull
    @Override
    public ModelAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(context).inflate(R.layout.model,parent,false);
        return new MyViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelAdapter.MyViewHolder holder, int position) {
        holder.constiuency.setText(list.get(position).getConstiuency());
        holder.MLA.setText(list.get(position).getMLA());
        if(list.get(position).getParty().contentEquals("JD(S)")){
            Picasso.with(context).load(R.drawable.jds1).into( holder.party);
        }else if(list.get(position).getParty().contentEquals("INC")){
            Picasso.with(context).load(R.drawable.congress).into( holder.party);
        }else {
            Picasso.with(context).load(R.drawable.bjp).into(holder.party);
            //Picasso.with(context).load(R.drawable.bjp).into(holder.party);
        }
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView constiuency,MLA;
        ImageView party;
        public MyViewHolder(View itemView) {
            super(itemView);
            constiuency=itemView.findViewById(R.id.conn);
            MLA=itemView.findViewById(R.id.MLA);
            party=itemView.findViewById(R.id.party);
        }
    }
}


