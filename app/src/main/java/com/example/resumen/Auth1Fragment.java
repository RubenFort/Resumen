package com.example.resumen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Auth1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Auth1Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Auth1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Auth1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Auth1Fragment newInstance(String param1, String param2) {
        Auth1Fragment fragment = new Auth1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

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