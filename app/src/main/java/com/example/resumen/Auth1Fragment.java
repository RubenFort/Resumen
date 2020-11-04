package com.example.resumen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class Auth1Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_auth1, container, false);

        Button frgAuth1Button = v.findViewById(R.id.frg_auth1_btn);
        frgAuth1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAuth2frg();
            }
        });

        return v;
    }

    private void irAuth2frg() {
        ((AuthActivity)getActivity()).cambiarFragment(new Auth2Fragment());
    }
}