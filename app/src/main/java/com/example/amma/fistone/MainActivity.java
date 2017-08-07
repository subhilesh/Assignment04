package com.example.amma.fistone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout1;
    LinearLayout layout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout1 = (LinearLayout)findViewById(R.id.layout1);
        layout2 = (LinearLayout)findViewById(R.id.layout2);
    }
   public void btn1click(View v){
       layout1.setVisibility(View.GONE);
       layout2.setVisibility(View.VISIBLE);
   }
    public void btn2click(View V){
        layout1.setVisibility(View.VISIBLE);
        layout2.setVisibility(View.GONE);
    }
}