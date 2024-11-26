package com.example.elimelechathRroyect_eli_m;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button submit;
    private EditText user;
    private String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);
        initveow();


    }


    public void initveow(){
        submit=findViewById(R.id.submit);
        user=findViewById(R.id.user);

        submit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
             st =user.getText().toString();
                intent.putExtra("user",st);
                startActivity(intent);
            }
        });
    }


}