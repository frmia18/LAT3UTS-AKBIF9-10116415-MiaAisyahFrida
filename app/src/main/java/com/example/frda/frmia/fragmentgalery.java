package com.example.frda.frmia;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class fragmentgalery extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<gallerymodel> imageModelArrayList;
    private galleryadapter adapter;

    private int[] myImageList = new int[]{R.drawable.image1, R.drawable.image2, R.drawable.image3,R.drawable.image4,R.drawable.image5};
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentgallery, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);

        imageModelArrayList = galerylist();
        adapter = new galleryadapter(this.getContext(),imageModelArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false));
        return view;
    }

    private ArrayList<gallerymodel> galerylist() {

        ArrayList<gallerymodel> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            gallerymodel fruitModel = new gallerymodel();
            fruitModel.setImage_drawable(myImageList[i]);
            list.add(fruitModel);
        }

        return list;
    }
}
