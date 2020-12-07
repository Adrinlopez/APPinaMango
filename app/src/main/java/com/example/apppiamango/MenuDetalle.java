package com.example.apppiamango;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.apppiamango.Entidad;

public class MenuDetalle extends AppCompatActivity {

    private Entidad menu;

    private TextView nombre,restorant_name,price;
    private ImageView food_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detalle);
        menu =(Entidad) getIntent().getSerializableExtra("ObjetoData");
        nombre =(TextView) findViewById(R.id.name);
        restorant_name =(TextView) findViewById(R.id.restorant_name);
        price =(TextView) findViewById(R.id.price);
        food_image = (ImageView)findViewById(R.id.food_image);







    }
}