package com.example.elimelechathRroyect_eli_m;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.provider.Telephony.Mms.Rate;
import android.view.View;
import android.widget.SeekBar;

public class RateActivity extends AppCompatActivity {

    private View save;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        initveow();
    }
    public void initveow() {
        save = findViewById(R.id.Save);
        seekBar = findViewById(R.id.SeekBar);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("rate",seekBar.getProgress());
                setResult(RESULT_OK,intent);
                finish();

            }
        });
    }
    }