package com.example.resumen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity2 extends AppCompatActivity {

    BlankFragment1 frg1 = new BlankFragment1();
    BlankFragment2 frg2 = new BlankFragment2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button volver_btn = findViewById(R.id.button);
        Button btnFrg1 = findViewById(R.id.buttonFragment1);
        Button btnFrg2 = findViewById(R.id.buttonFragment2);

        initView(btnFrg1);

        volver_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                volverMain();
            }
        });

        btnFrg1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(frg1);
            }
        });

        btnFrg2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(frg2);
            }
        });
    }

    private void initView(Button btnFrg1) {
        changeFragment(frg1);
    }

    private void changeFragment(Fragment frg) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();

        trans.replace(R.id.main_fragment, frg);
        trans.commit();
    }

    private void volverMain() {
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);
    }
}