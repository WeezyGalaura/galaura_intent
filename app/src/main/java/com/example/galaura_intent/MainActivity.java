package com.example.galaura_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View next = findViewById(R.id.btnNext);

        next.setOnClickListener(this); 

    }

    @Override
    public void onClick(View v) {

        TextView display = findViewById(R.id.txtdisplay);
        EditText input = findViewById(R.id.txtMonthValue);

        Intent i = new Intent(MainActivity.this, secondscreen.class);

        switch (v.getId()) {
            case R.id.btnNext:
                int numberMonths = Integer.parseInt(String.valueOf(input.getText()));

                i.putExtra("INT_MONTHS", numberMonths);
                startActivity(i);
                break;
        }
    }
}