package com.example.apppiamango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PrincipalBotones extends AppCompatActivity implements View.OnClickListener{

    ImageButton btnMenu, btnFavoritos, btnCarrito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_botones);

        btnMenu = findViewById(R.id.btn_menu);
        btnFavoritos = findViewById(R.id.btn_favoritos);
        btnCarrito = findViewById(R.id.btn_carrito);

        btnMenu.setOnClickListener(this);
        btnFavoritos.setOnClickListener(this);
        btnCarrito.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intMenu = new Intent(this, Inicio.class);
        startActivity(intMenu);
    }
    public void onClick2(View v){
        Intent intFavorito = new Intent(this, Registro.class);
        startActivity(intFavorito);
    }
    public void onClick3(View v){
        Intent intCarrito = new Intent(this, Registro.class);
        startActivity(intCarrito);
    }


}