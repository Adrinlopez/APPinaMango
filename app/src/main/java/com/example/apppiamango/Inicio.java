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

        listItems.add(new Entidad(R.drawable.pi_a_loca,"PIÑA LOCA","Nuestra piña tiene frutas que mas te gusten y disfrutala con el chile, limón, sal y salsa. Si la deseas con un toque diferente le puedes agregar el licor de tu preferencia con un costo adicional de $1.00.","$3.50"));
        listItems.add(new Entidad(R.drawable.pi_a_mix,"PIÑA MIX","Con deliosa fruta de temporada y ingredientes de la casa","$3.00"));
        listItems.add(new Entidad(R.drawable.smoothies_de_mango,"SMOOTHIES DE MANGO","Es preparado con ingredientes naturales y saludables","$2.50"));
        listItems.add(new Entidad(R.drawable.smoothies_pi_amango,"SMOOTHIES DE PIÑA/MANGO","Es preparado con ingredientes naturales y saludables","$2.50"));
        listItems.add(new Entidad(R.drawable.smoothies_de_lim_n,"SMOOTHIES DE LIMON","Es preparado con ingredientes naturales y saludables","$2.50"));
        listItems.add(new Entidad(R.drawable.smoothies_de_coco,"FSMOOTHIES DE COCO","Es preparado con ingredientes naturales y saludables","$2.50"));
        listItems.add(new Entidad(R.drawable.frappe_oreo,"FRAPPE DE OREOS","Te encantara esa mezcla deliciosa","$2.50"));
        listItems.add(new Entidad(R.drawable.licuado_nomada,"LICUADOS NOMADA","Este licuado te encanta con la mezcla de sabores","$2.25"));
        listItems.add(new Entidad(R.drawable.licuado_kalifa,"LICUADOS KALIFA","Este licuado te encanta con la mezcla de sabores","$2.25"));
        listItems.add(new Entidad(R.drawable.nirvana_smoti,"LICUADO NIRVANA","Este licuado te encanta con la mezcla de sabores","$2.25"));
        listItems.add(new Entidad(R.drawable.limonada,"LIMONADA","Sabor natural","$1.75"));
        listItems.add(new Entidad(R.drawable.cafe,"CAFÉ AMERICANO","Puedes disfrutarlo con nuestro café 100% puro","$1.00"));
        listItems.add(new Entidad(R.drawable.cafe_expreso,"CAFÉ EXPRESO","Puedes disfrutarlo con nuestro café 100% puro","$1.25"));
        listItems.add(new Entidad(R.drawable.capuchino,"CAPUCHINO","Una nueva versión de un gran clásico que sorprenderá a su paladar","$1.50"));
        listItems.add(new Entidad(R.drawable.cafe_helado,"CAFÉ HELADO","Si te gusta el café, pero lo prefieres frio es tu mejor opcion","$1.50"));
        listItems.add(new Entidad(R.drawable.mangoneada,"MANGONEADAS","Una deliciosa paleta helada","$0.25"));
        listItems.add(new Entidad(R.drawable.minuta_loka,"MINUTAS LOKAS","Esta minuta te hara desear otra, con sabores unicos ","$2.00"));
        listItems.add(new Entidad(R.drawable.miel,"MIEL DE ABEJA","Si buscas una piel 100% pura es tu mejor opcion","$1.50"));

        listItems.add(new Entidad(R.drawable.nachos,"NACHOS","Deliciosos nachos con carne ","$1.50"));
        listItems.add(new Entidad(R.drawable.hamburguesa,"HAMBURGUESAS","Pues disfrutarla con su carne fresca y recien preparada y por su puestos sus deliciosas papitas fritas","$1.50"));
        listItems.add(new Entidad(R.drawable.papas,"PAPAS FRITAS","Nuestas papas te encantaran","$1.25"));
        listItems.add(new Entidad(R.drawable.sandwich,"SANDWICH","Un rico sandwich de jamon y queso","$1.50"));
        listItems.add(new Entidad(R.drawable.hot_cakes,"HOT CAKES","Si gusta de un rico de sayuno no te lo puedes perder ","$2.00"));
        listItems.add(new Entidad(R.drawable.crepas,"CREPAS","Tu decides si te gusta lo dulce o las prefieres salada","$2.50"));
        listItems.add(new Entidad(R.drawable.yogur,"YOGUR","Excelente opcion para un desayuno saludable, cereal y fruta fresca","$1.50"));
        listItems.add(new Entidad(R.drawable.arte,"TAZAS Y CUADROS","Si quieres llevarte un lindo recuerdo de la capital del balsamo, te ofrecemos tazas y cuadros hermosos","$1.50"));
        listItems.add(new Entidad(R.drawable.pulseras,"PULSERAS","Otra opcion para que tengas un recuerdo de tu visita","$1.50"));





        return listItems;
    }
}





