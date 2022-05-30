package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class three extends AppCompatActivity {
    private Button button;
    private Button never,often,sometimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        button=(Button) findViewById(R.id.page7);
        button.setEnabled(false);
        button.setOnClickListener(view -> openfour());
        never = (Button) findViewById(R.id.p3never);
        often = (Button) findViewById(R.id.p3often);
        sometimes = (Button) findViewById(R.id.p3sometimes);

        never.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.features.add(0);
                MainActivity.featuresname.add("Never");
                never.setBackgroundColor(Color.GREEN);
                never.setEnabled(false);
                sometimes.setEnabled(false);
                often.setEnabled(false);
                button.setEnabled(true);


            }
        });

        sometimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.features.add(3);
                MainActivity.featuresname.add("Sometimes");
                sometimes.setBackgroundColor(Color.GREEN);
                never.setEnabled(false);
                sometimes.setEnabled(false);
                often.setEnabled(false);
                button.setEnabled(true);
            }
        });
        often.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.features.add(1);
                MainActivity.featuresname.add("Often");
                often.setBackgroundColor(Color.GREEN);
                never.setEnabled(false);
                sometimes.setEnabled(false);
                often.setEnabled(false);
                button.setEnabled(true);
            }
        });
    }
    public void openfour(){
        Intent intent=new Intent(this, four.class);
        startActivity(intent);
    }
}