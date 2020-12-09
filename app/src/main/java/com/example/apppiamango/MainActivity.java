package com.example.apppiamango;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText TextEmail;
    private EditText TextPassword;
    private Button btnLogin;
    private Button btnIniciar;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        TextEmail = findViewById(R.id.edtCorreo);
        TextPassword = findViewById(R.id.edtContra);
        btnIniciar = findViewById(R.id.btn_ir_crearCuenta);
        btnLogin =findViewById(R.id.btnLogin);

        btnIniciar.setOnClickListener(this);
        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        // updateUI(currentUser);
    }

   public void IniciarSesion(){
           //Obtenemos el email y la contraseña desde las cajas de texto
           final String email = TextEmail.getText().toString().trim();
           String password = TextPassword.getText().toString().trim();

           //Verificamos que las cajas de texto no esten vacías
           if (TextUtils.isEmpty(email)) {//(precio.equals(""))
               Toast.makeText(this, "Se debe ingresar un email", Toast.LENGTH_LONG).show();
               return;
           }

           if (TextUtils.isEmpty(password)) {
               Toast.makeText(this, "Falta ingresar la contraseña", Toast.LENGTH_LONG).show();
               return;
           }



           //loguear usuario
           mAuth.signInWithEmailAndPassword(email, password)
                   .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                       @Override
                       public void onComplete(@NonNull Task<AuthResult> task) {
                           //checking if success
                           if (task.isSuccessful()) {
                               int pos = email.indexOf("@");
                               String user = email.substring(0, pos);
                               Toast.makeText(MainActivity.this, "Bienvenido: " + TextEmail.getText(), Toast.LENGTH_LONG).show();
                               Intent intencion = new Intent(getApplication(), PrincipalBotones.class);
                               startActivity(intencion);


                               } else {
                                   Toast.makeText(MainActivity.this, "No se pudo registrar el usuario ", Toast.LENGTH_LONG).show();
                               }
                           }


                   });


       }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogin:
                //Invocamos al método:
                IniciarSesion();
                break;

            case R.id.btn_ir_crearCuenta:
                Intent intencion = new Intent(getApplicationContext(), Registro.class);
                startActivity(intencion);
                break;
        }






        }

    }



