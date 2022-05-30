package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class seven extends AppCompatActivity {

    private Button yes,no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven2);
        Button button = findViewById(R.id.page7);
        button.setEnabled(false);

        button.setOnClickListener(view -> seven.this.opened());
        yes = (Button) findViewById(R.id.p7yes);
        no = (Button) findViewById(R.id.p7no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.features.add(2);
                MainActivity.featuresname.add("Yes");
                yes.setBackgroundColor(Color.GREEN);
                yes.setEnabled(false);
                no.setEnabled(false);
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
                button.setEnabled(true);



            }
        });
    }
    public void opened(){
        Intent intent=new Intent(this, eight.class);
        startActivity(intent);
    }
}