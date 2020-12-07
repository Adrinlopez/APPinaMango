package com.example.apppiamango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    EditText edtCorreo, edtContra;
    Button btnLogin, btn_ir_crearCuenta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        edtCorreo = findViewById(R.id.edtCorreo);
        edtContra = findViewById(R.id.edtContra);
        btnLogin = findViewById(R.id.btnLogin);
        btn_ir_crearCuenta=findViewById(R.id.btn_ir_crearCuenta);

        btnLogin.setOnClickListener(this);
        btn_ir_crearCuenta.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ir_crearCuenta:
                Intent in1 = new Intent(this, Registro.class);
                startActivity(in1);
                break;

            case R.id.btnLogin:
                if (edtCorreo.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Campo Correo Vacio", Toast.LENGTH_LONG).show();
                } else {
                    if (edtContra.getText().toString().isEmpty()) {
                        Toast.makeText(this, "Campo Contraseña Vacio", Toast.LENGTH_LONG).show();
                    } else {
                        Intent in = new Intent(this, Inicio.class);
                        startActivity(in);
                        break;


                    }


                }
        }
    }
}

