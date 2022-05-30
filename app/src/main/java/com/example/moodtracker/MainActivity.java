package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button button;
    public static List<Integer> features;
    public static List<String> featuresname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!Python.isStarted())
        {
            Python.start(new AndroidPlatform(this));
        }




        button=(Button) findViewById(R.id.page7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentwo();
                features = new ArrayList<>();
                featuresname = new ArrayList<>();
            }
        });
    }
    public void opentwo(){
        Intent intent=new Intent(this, two.class);
        startActivity(intent);
    }
}