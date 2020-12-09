package com.example.apppiamango;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.apppiamango.Entidad;

public class MenuDetalle extends AppCompatActivity {
    private TextView tvTitulo, tvDescripcion,tvprecio;
    private ImageView imgFoto;
    private Entidad item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detalle);
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
    }
}
