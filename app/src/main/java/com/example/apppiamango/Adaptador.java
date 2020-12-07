package com.example.apppiamango;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context context;
    private ArrayList<Entidad>listItems;

    public Adaptador(Context context, ArrayList<Entidad> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      final   Entidad menu =(Entidad) getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.menu,null);
         TextView name =(TextView) convertView.findViewById(R.id.name);
        TextView restorant_name =(TextView) convertView.findViewById(R.id.restorant_name);
        TextView price =(TextView) convertView.findViewById(R.id.price);
        ImageView food_image =(ImageView) convertView.findViewById(R.id.food_image);


        food_image.setImageResource(menu.getImgFoto());
        name.setText(menu.getNombre());
        restorant_name.setText(menu.getContenido());
        price.setText(menu.getDescripcion());



        return convertView;
    }
}
