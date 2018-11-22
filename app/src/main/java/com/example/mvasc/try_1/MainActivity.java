package com.example.mvasc.try_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next_click(android.view.View next){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

}