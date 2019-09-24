package com.parvez.passingdatabetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.parvez.passingdatabetweenactivities.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.parvez.passingdatabetweenactivities.EXTRA_NUMBER";
    public static final String EXTRA_DOUBLE = "com.parvez.passingdatabetweenactivities.EXTRA_DOUBLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        EditText editText1 = findViewById(R.id.edittext1);
        String text = editText1.getText().toString();

        EditText editText2 = findViewById(R.id.edittext2);
        int number = Integer.parseInt(editText2.getText().toString());

        EditText editText3=findViewById(R.id.edittext3);
        double d=Double.parseDouble(editText3.getText().toString());

        final ArrayList<String> list=new ArrayList<String>();
        list.add("parvez");
        list.add("alam");
        list.add("junaid");

        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_NUMBER, number);
        intent.putExtra("array_list",list);
        intent.putExtra("double",d);
        //intent.putExtra(EXTRA_DOUBLE,doubleNumber);
        startActivity(intent);

    }
}
