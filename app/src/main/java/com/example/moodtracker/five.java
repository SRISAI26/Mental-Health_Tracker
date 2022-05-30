package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class five extends AppCompatActivity {

    private Button yes,no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        Button button = (Button) findViewById(R.id.page7);
        button.setEnabled(false);
        button.setOnClickListener(view -> opensix());

        yes = (Button) findViewById(R.id.p5yes);
        no = (Button) findViewById(R.id.p5no);

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

                MainActivity.features.add(1);
                MainActivity.featuresname.add("No");
                no.setBackgroundColor(Color.GREEN);
                yes.setEnabled(false);
                no.setEnabled(false);
                button.setEnabled(true);



            }
        });
    }
    public void opensix(){
        Intent intent=new Intent(this, six.class);
        startActivity(intent);

    }
}