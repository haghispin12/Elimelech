package com.example.elimelechathRroyect_eli_m;


import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
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
    private String st;
    private String ai;
    private Exercize exe;
    private Button Rate;
    private TextView tview;
    private TextView name;
    private String sst;
    private int num3;
    private int num;



    ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    num = result.getData().getIntExtra("rate",-1);
                  updateViews(num,num);
                }
            }
    );
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       initveow();
        Intent intent = getIntent();
        sst=intent.getStringExtra("user");
        name.setText(sst);
    }
    @SuppressLint("MissingInflatedId")
    public void initveow(){
        exe=new Exercize();
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
        Rate=findViewById(R.id.RATE2);
        tview=findViewById(R.id.View11);
        name=findViewById(R.id.etr);





        loah.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                exe.loah();
                updateViews(exe.getNum(),exe.getnum2());
                num3= exe.getNum()* exe.getnum2();
            }
        });

        loah20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exe.loah20();
                updateViews(exe.getNum(),exe.getnum2());
                num3= exe.getNum()* exe.getnum2();
            }
        });

        challenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exe.challenge();
                updateViews(exe.getNum(),exe.getnum2());
                 num3 = exe.getNum() * exe.getnum2();
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(exe.test(Answer.getText().toString())) {
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

        Rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RateActivity.class);
                startActivity(intent);


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



