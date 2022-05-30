package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class eight extends AppCompatActivity {




    private TextView p8gender,predictionview;
    public  String prediction;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(view -> eight.this.opened());
        prediction = new String();

        /*for(int i : MainActivity.features)
        System.out.println(i +" ");


        for(String s : MainActivity.featuresname)
        System.out.println(s +" ");*/

        p8gender  = (TextView) findViewById(R.id.p8gender);
        predictionview  = (TextView) findViewById(R.id.prediction);
        p8gender.setText("Gender: " + MainActivity.featuresname.get(0));

        //python execution
        url = "https://mental-health-tracker-project.herokuapp.com/predict";

        StringRequest stringrequest = new StringRequest(Request.Method.POST,url, new Response.Listener<String>() {


            @Override
            public void onResponse(String response) {

                try {
                    JSONObject jobj = new JSONObject(response);

                     prediction = jobj.getString("prediction");
                     predictionview.setText(prediction);

                }
                catch (JSONException e) {
                    e.printStackTrace();
                    System.out.println("Problem is here");

                }


            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                System.out.println("ERROR");

            }
        }){

            @Override
            protected Map<String,String> getParams()
            {
                String reslst ="";
                for(int i:MainActivity.features)
                {
                    reslst += Integer.toString(i);
                }
                Map<String,String> params = new HashMap<String,String>();

                params.put("lst",reslst);

                return params;

            }};
        RequestQueue queue = Volley.newRequestQueue(eight.this);
        queue.add(stringrequest);











    }
    public void opened(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);




    }
}