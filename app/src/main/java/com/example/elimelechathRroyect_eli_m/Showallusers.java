package com.example.elimelechathRroyect_eli_m;

import static android.app.Activity.RESULT_OK;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Showallusers extends Fragment {

    Uri uri;
    Button addpicture;
    ImageView uosrpic;
    TextView userid;
    TextView score;
    TextView rating;
    Button adduoser;

    ActivityResultLauncher<Intent> startCamera=registerForActivityResult(

            new ActivityResultContracts.StartActivityForResult(),

            new ActivityResultCallback<ActivityResult>() {

                @Override

                public void onActivityResult(ActivityResult result) {

                    if (result.getResultCode() == RESULT_OK) {

                        uosrpic.setImageURI(uri);

                    }

                }

            });




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1= inflater.inflate(R.layout.layout_showalluser, container, false);
        //adduser= v1.findViewById(R.id.)

        addpicture= v1.findViewById(R.id.btnAddPic);
        uosrpic=v1.findViewById(R.id.ivPic);
        userid=v1.findViewById(R.id.etUser);
        score=v1.findViewById(R.id.score);
        rating=v1.findViewById(R.id.rating);
        adduoser=v1.findViewById(R.id.adduoser);


        addpicture.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                ContentValues values = new ContentValues();

                values.put(MediaStore.Images.Media.TITLE, "New Picture");

                values.put(MediaStore.Images.Media.DESCRIPTION, "From Camera");

                uri =
                        requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, uri);

                startCamera.launch(cameraIntent);
            }
        });

        return v1;


    }





}