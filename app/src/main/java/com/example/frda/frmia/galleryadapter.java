package com.example.frda.frmia;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class galleryadapter extends RecyclerView.Adapter<galleryadapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<gallerymodel> imageModelArrayList;

    public galleryadapter(Context ctx, ArrayList<gallerymodel> imageModelArrayList){

        inflater = LayoutInflater.from(ctx);
        this.imageModelArrayList = imageModelArrayList;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.galleryitem, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.iv.setImageResource(imageModelArrayList.get(position).getImage_drawable());
    }

    @Override
    public int getItemCount() {
        return imageModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{


        ImageView iv;

        public MyViewHolder(View itemView) {
            super(itemView);
;
            iv = (ImageView) itemView.findViewById(R.id.iv);
        }

    }
}