package com.example.elimelechathRroyect_eli_m;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.inappmessaging.model.Button;

public class Showallusers extends Fragment {


    Button addpicture;
    Button adduser;
    EditText etUser;
    TextView userid;
    TextView score;
    TextView rating;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1= inflater.inflate(R.layout.layout_showalluser, container, false);
        //adduser= v1.findViewById(R.id.)
        etUser=v1.findViewById(R.id.etUser);

        return v1;
    }
}