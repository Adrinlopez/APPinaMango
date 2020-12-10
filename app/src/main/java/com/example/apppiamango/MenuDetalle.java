package com.example.apppiamango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apppiamango.Entidad;

public class MenuDetalle extends AppCompatActivity {
    private TextView tvTitulo, tvDescripcion,tvprecio;
    private ImageView imgFoto;
    private Entidad item;

    Button btnFavorito, btnCarrito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detalle);

        Context context = this;
        SharedPreferences sharprefs = getSharedPreferences("ArchivoSP", context.MODE_PRIVATE);


        //CONEXION DE BOTONES CARITO Y FAVORITOS CON LA INTERFAZ
        btnFavorito = findViewById(R.id.btnfav);
        btnCarrito = findViewById(R.id.btnCarrito);

        item = (Entidad) getIntent().getSerializableExtra("item");
        if (item != null){
            tvTitulo = findViewById(R.id.tvTitulo);
            tvDescripcion = findViewById(R.id.tvDescripcion);
            imgFoto = findViewById(R.id.imgFoto);
            tvprecio = findViewById(R.id.tvprecio);

            tvTitulo.setText(item.getTitulo());
            tvDescripcion.setText(item.getContenido());
            imgFoto.setImageResource(item.getImgFoto());
            tvprecio.setText(item.getPrecio());
        }

        btnFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharpref = getPreferences(context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharpref.edit();
                editor.putString("MiDato", tvTitulo.getText().toString());
                Toast.makeText(getApplicationContext(), "Producto agregado a favoritos", Toast.LENGTH_LONG);
                editor.commit();

            }
        });
        btnCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharpref = getPreferences(context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharpref.edit();
                editor.putString("MiDato", tvTitulo.getText().toString());
                Toast.makeText(getApplicationContext(), "Producto agregado al carrito", Toast.LENGTH_LONG);
                editor.commit();

            }
        });
    }
}
