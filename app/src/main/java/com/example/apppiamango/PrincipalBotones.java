package com.example.apppiamango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class PrincipalBotones extends AppCompatActivity implements View.OnClickListener {

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
        switch (v.getId()) {
            case R.id.btn_menu:
                Intent in1 = new Intent(this, Inicio.class);
                startActivity(in1);
                break;
        }
            switch (v.getId()) {
                case R.id.btn_favoritos:
                    Intent in2 = new Intent(this, Inicio.class);
                    startActivity(in2);
                    break;
            }
                switch (v.getId()) {
                    case R.id.btn_favoritos:
                        Intent in3 = new Intent(this, Inicio.class);
                        startActivity(in3);
                        break;

                }
            }
        }


