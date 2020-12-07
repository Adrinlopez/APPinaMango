package com.example.apppiamango;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Inicio extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;
    private ArrayList<Entidad> arrayentidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        arrayentidad = GetArrayItems();
        lvItems = (ListView) findViewById(R.id.lvItems);
        adaptador = new  Adaptador(this,arrayentidad);

        lvItems.setAdapter(adaptador);
        lvItems.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(Inicio.this,MenuDetalle.class);
            intent.putExtra("objetoData",arrayentidad.get(position));
            startActivity(intent);
        });
    }

    private ArrayList<Entidad> GetArrayItems() {
        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));
        listItems.add(new Entidad(R.drawable.asiafood1,"Float Cake Vietnam","restorant_name","$6.05"));


        return listItems;
    }
}





