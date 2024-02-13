package com.example.elimelechathRroyect_eli_m;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button loah;
    private Button challenge;
    private Button loah20;
    private Button test;
    private Button save;
    private Button showaallusers;
    private TextView empty1;
    private TextView empty2;
    private TextView X;
    private EditText Answer;
    private int num;
    private int num2;
    private int num3;
    private String st;
    private int numb;
    private String ai;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       initveow();

    }
    public void initveow(){
        setContentView(R.layout.activity_main);
        loah = findViewById(R.id.loah);
        loah20 = findViewById(R.id.loah20);
        challenge = findViewById(R.id.challenge);
        test = findViewById(R.id.test);
        save = findViewById(R.id.save);
        showaallusers = findViewById(R.id.showallusers);
        empty1 = findViewById(R.id.erer1);
        empty2 = findViewById(R.id.erer3);
        X = findViewById(R.id.erer2);
        Answer = findViewById(R.id.Answer);

        loah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int num = r.nextInt(9)+1;
                int num2 = r.nextInt(9)+1;
                updateViews( num, num2);
                num3=num*num2;
            }
        });

        loah20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int num = r.nextInt(19)+1;
                int num2 = r.nextInt(9)+1;
                updateViews(num, num2);
                num3=num*num2;
            }
        });

        challenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int num = r.nextInt(99)+1;
                int num2 = r.nextInt(9)+1;
                updateViews(num,num2);
                num3=num*num2;
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int st=Integer.valueOf(Answer.getText().toString());
               int rt = num3;
                if(st==rt) {
                    ai = "כל הכבוד";
                    updateViewst(ai);
                }
                    else{
                    ai="לוזר" ;
                    updateViewst(ai);

                }


                    ;
            }

        });




    }
    public void updateViews(int num,int num2){
        empty1.setText(num+"");
        empty2.setText(num2+"");
    }
    public void updateViewst(String ai){
        empty1.setText(ai);
        empty2.setText(ai);
    }



}