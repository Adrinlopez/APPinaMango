package com.example.apppiamango;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class Inicio extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;
    private ArrayList<Entidad> arrayEntidad = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        lvItems = (ListView) findViewById(R.id.lvItems);

        llenarItems();
    }

    private void llenarItems(){

        arrayEntidad.add(new Entidad(R.drawable.pi_a_loca,"Nuestra piña tiene frutas que mas te gusten y disfrutala con el chile, limón, sal","PIÑA LOCA"," $1.00."));
        arrayEntidad.add(new Entidad(R.drawable.smoothies_de_mango,"Es preparado con ingredientes naturales y saludables","SMOOTHIES DE MANGO","$2.50"));
        arrayEntidad.add(new Entidad(R.drawable.smoothies_pi_amango,"Es preparado con ingredientes naturales y saludables","SMOOTHIES DE PIÑA/MANGO","$2.50"));
        arrayEntidad.add(new Entidad(R.drawable.smoothies_de_lim_n,"Es preparado con ingredientes naturales y saludables","SMOOTHIES DE LIMON","$2.50"));
        arrayEntidad.add(new Entidad(R.drawable.smoothies_de_coco,"Es preparado con ingredientes naturales y saludables","SMOOTHIES DE COCO","$2.50"));
        arrayEntidad.add(new Entidad(R.drawable.frappe_oreo,"Te encantara esa mezcla deliciosa","FRAPPE DE OREOS","$2.50"));
        arrayEntidad.add(new Entidad(R.drawable.licuado_nomada,"Este licuado te encanta con la mezcla de sabores","LICUADOS NOMADA","$2.25"));
        arrayEntidad.add(new Entidad(R.drawable.licuado_kalifa,"Este licuado te encanta con la mezcla de sabores","LICUADOS KALIFA","$2.25"));
        arrayEntidad.add(new Entidad(R.drawable.nirvana_smoti,"Este licuado te encanta con la mezcla de sabores","LICUADO NIRVANA","$2.25"));
        arrayEntidad.add(new Entidad(R.drawable.limonada,"Sabor natural","LIMONADA","$1.75"));
        arrayEntidad.add(new Entidad(R.drawable.cafe,"Puedes disfrutarlo con nuestro café 100% puro","CAFÉ AMERICANO","$1.00"));
        arrayEntidad.add(new Entidad(R.drawable.cafe_expreso,"Puedes disfrutarlo con nuestro café 100% puro","CAPUCHINO","$1.25"));
        arrayEntidad.add(new Entidad(R.drawable.capuchino,"Una nueva versión de un gran clásico que sorprenderá a su paladar","CAFÉ EXPRESO","$1.50"));
        arrayEntidad.add(new Entidad(R.drawable.cafe_helado,"Si te gusta el café, pero lo prefieres frio es tu mejor opcion","CAFÉ HELADO","$1.50"));
        arrayEntidad.add(new Entidad(R.drawable.mangoneada,"Si te gusta el café, pero lo prefieres frio es tu mejor opcion","Una deliciosa paleta helada","$0.25"));
        arrayEntidad.add(new Entidad(R.drawable.minuta_loka,"MANGONEADAS","Si te gusta el café, pero lo prefieres frio es tu mejor opcion","$2.00"));
        arrayEntidad.add(new Entidad(R.drawable.miel,"Si buscas una piel 100% pura es tu mejor opcion","MIEL DE ABEJA","$1.50"));
        adaptador = new Adaptador(this, arrayEntidad);
        lvItems.setAdapter(adaptador);
    }
}
