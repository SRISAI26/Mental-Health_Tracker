package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class four extends AppCompatActivity {

    private Button yes,no,dontknow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        Button button = (Button) findViewById(R.id.page7);
        button.setEnabled(false);
        button.setOnClickListener(view -> offensive());
        yes = (Button) findViewById(R.id.p4yes);
        no = (Button) findViewById(R.id.p4no);
        dontknow = (Button) findViewById(R.id.p4dontknow);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.features.add(2);
                MainActivity.featuresname.add("Yes");
                yes.setBackgroundColor(Color.GREEN);
                yes.setEnabled(false);
                no.setEnabled(false);
                dontknow.setEnabled(false);
                button.setEnabled(true);


            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.features.add(0);
                MainActivity.featuresname.add("No");
                no.setBackgroundColor(Color.GREEN);
                yes.setEnabled(false);
                no.setEnabled(false);
                dontknow.setEnabled(false);
                button.setEnabled(true);


            }
        });
        dontknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.features.add(1);
                MainActivity.featuresname.add("Don't know");
                dontknow.setBackgroundColor(Color.GREEN);
                yes.setEnabled(false);
                no.setEnabled(false);
                dontknow.setEnabled(false);


            }
        });
    }
    public void offensive(){
        Intent intent=new Intent(this, five.class);
        startActivity(intent);
    }
}