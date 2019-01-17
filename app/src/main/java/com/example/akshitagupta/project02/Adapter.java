package com.example.akshitagupta.project02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    Context c;
    ArrayList<Cars> car;

    public Adapter(Context c,ArrayList<Cars> car){
        //Constructor
        this.c=c;
        this.car=car;
    }



    @Override
    public int getCount() {   //Returns the number of items managed by adapter
        return car.size();
    }

    @Override
    public Object getItem(int i) {
        return car.get(i);
    }

    @Override
    public long getItemId(int i) {   //Return the resource reference for item at position
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inf= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view==null)
            view = inf.inflate(R.layout.model, viewGroup,false);

        ImageView image =(ImageView) view.findViewById(R.id.imageView1);
        TextView txt= (TextView) view.findViewById(R.id.textView1);

        image.setImageResource(car.get(i).getImage());
        txt.setText(car.get(i).getBrand());

        return view;
    }
}

