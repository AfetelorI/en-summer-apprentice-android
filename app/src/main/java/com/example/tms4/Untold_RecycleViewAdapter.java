package com.example.tms4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Untold_RecycleViewAdapter extends RecyclerView.Adapter<Untold_RecycleViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<CardForEvents> cardForEvents;
    public Untold_RecycleViewAdapter(Context context, ArrayList<CardForEvents> cardForEvents){
        this.context=context;
        this.cardForEvents=cardForEvents;
    }

    @NonNull
    @Override
    public Untold_RecycleViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new Untold_RecycleViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Untold_RecycleViewAdapter.MyViewHolder holder, int position) {
        holder.nameView.setText(cardForEvents.get(position).getNume_event());
        holder.descView.setText(cardForEvents.get(position).getDescriere_event());
        holder.imageView.setImageResource(cardForEvents.get(position).getImage_event());
    }

    @Override
    public int getItemCount() {
        return cardForEvents.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{


        ImageView imageView;
        TextView nameView, descView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameView = itemView.findViewById(R.id.textView);
            descView = itemView.findViewById(R.id.textView2);
        }
    }
}
