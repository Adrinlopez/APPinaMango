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
        btnFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intFavorito = new Intent(PrincipalBotones.this, Favoritos.class);
                startActivity(intFavorito);
            }
        });
        btnCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intCarrito = new Intent(PrincipalBotones.this, Carrito.class);
                startActivity(intCarrito);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intMenu = new Intent(this, Inicio.class);
        startActivity(intMenu);
    }
}