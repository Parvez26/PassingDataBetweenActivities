package com.parvez.passingdatabetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent=getIntent();
        String text=intent.getStringExtra(MainActivity.EXTRA_TEXT);

        //double d=intent.getDoubleExtra("double",0);
        int number=intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);
        double d=intent.getDoubleExtra("double",0);

        TextView textView1=findViewById(R.id.textview1);
        TextView textView2=findViewById(R.id.textview2);
        TextView textView3=findViewById(R.id.textview3);


        textView1.setText(text);
        textView2.setText(String.valueOf(number));

        try{
            textView3.setText(String.valueOf(d));
        }catch (Exception e){
            e.printStackTrace();
        }


        /*Bundle bundle=getIntent().getExtras();
        ArrayList<String> list=bundle.getStringArrayList("array_list");*/
    }
}
