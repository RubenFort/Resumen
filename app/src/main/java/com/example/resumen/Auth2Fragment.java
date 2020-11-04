package com.example.resumen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class Auth2Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_auth2, container, false);

        Button auth2FrgBtn = v.findViewById(R.id.frg_auth2_btn);
        auth2FrgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAuth1Frg();
            }
        });

        return v;
    }

    private void irAuth1Frg() {
        ((AuthActivity)getActivity()).cambiarFragment(new Auth1Fragment());

    }
}