package com.example.fruitdeliveryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    Context context;
    String[] name, price;
    int[] images;

    public MyAdapter(Context context, String[] name, String[] price, int[] images) {
        this.context = context;
        this.name = name;
        this.price = price;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
       View view = layoutInflater.inflate(R.layout.simple_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.name.setText(name[position]);
        holder.price.setText(price[position]);
        holder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name, price;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nameID);
            price = itemView.findViewById(R.id.priceID);
            imageView= itemView.findViewById(R.id.imageViewID);
        }
    }
}
