package com.example.resumen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MainActivity2 mainAct2_btn = new MainActivity2();
    AuthActivity authActo_btn = new AuthActivity();
    AdapterActivity adaptAct_btn = new AdapterActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pasarPantalla_btn =  findViewById(R.id.act_main_btn);
        Button pasarAuth_btn = findViewById(R.id.act_main_authact_btn);
        Button pasarAdapt_btn = findViewById(R.id.act_main_lista_btn);

        pasarPantalla_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                pasarPantala(mainAct2_btn);
            }

        });

        pasarAuth_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                pasarPantala(authActo_btn);
            }

        });

        pasarAdapt_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                pasarPantala(adaptAct_btn);
            }
        });
    }

    private void pasarPantala(Activity acti) {
        Intent intent = new Intent(this, acti.getClass());
        startActivity(intent);
    }

}