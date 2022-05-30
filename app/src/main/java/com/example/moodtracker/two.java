package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class two extends AppCompatActivity {
    private Button button;
    private Button gender1,gender2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button=(Button) findViewById(R.id.page7);
        button.setEnabled(false);
        button.setOnClickListener(view -> openthree());
        gender1 = (Button) findViewById(R.id.gender1);
        gender2 = (Button) findViewById(R.id.gender2);
        gender1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.features.add(1);
                MainActivity.featuresname.add("Male");
                gender1.setBackgroundColor(Color.GREEN);
                gender1.setEnabled(false);
                gender2.setEnabled(false);
                button.setEnabled(true);

            }
        });
        gender2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                MainActivity.features.add(0);
                MainActivity.featuresname.add("Female");
                gender2.setBackgroundColor(Color.GREEN);
                gender2.setEnabled(false);
                gender1.setEnabled(false);
                button.setEnabled(true);

            }
        });
    }
    public void openthree(){
        Intent intent=new Intent(this, three.class);
        startActivity(intent);
    }
}