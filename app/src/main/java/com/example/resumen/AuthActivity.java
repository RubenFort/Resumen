package com.example.resumen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class AuthActivity extends AppCompatActivity {

    Auth1Fragment Auth1Frg = new Auth1Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        initView();

    }

    private void initView() {
        cambiarFragment(Auth1Frg);
    }

    public void cambiarFragment(Fragment frg) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();

        trans.replace(R.id.frg_Auth, frg);

        trans.commit();
    }
}