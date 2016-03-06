package com.assignment.acadgild.android_session3_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        TextView violate,indigo, blue, green,yellow, orange, red;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        violate = (TextView) findViewById(R.id.textViolate);
        indigo = (TextView) findViewById(R.id.textIndigo);
        blue = (TextView) findViewById(R.id.textBlue);
        green = (TextView) findViewById(R.id.textGreen);
        yellow = (TextView) findViewById(R.id.textYellow);
        orange = (TextView) findViewById(R.id.textOrange);
        red = (TextView) findViewById(R.id.textRed);

        violate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("MMP", "You touched Violate ");
                        Toast.makeText(MainActivity.this, "You touched Violate", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MMP", "You touched Indigo Color ");
                Toast.makeText(MainActivity.this, "You touched Indigo color", Toast.LENGTH_SHORT).show();
            }
        });

        blue.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("MMP", "You touched Blue Color ");
                        Toast.makeText(MainActivity.this, "You touched Blue color", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        green.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("MMP", "You touched Green Color ");
                        Toast.makeText(MainActivity.this, "You touched Green color", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        yellow.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("MMP", "You touched Yellow Color ");
                        Toast.makeText(MainActivity.this, "You touched Yellow color", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        orange.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("MMP", "You touched Orange Color ");
                        Toast.makeText(MainActivity.this, "You touched Orange color", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        red.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("MMP", "You clicked Red Color ");
                        Toast.makeText(MainActivity.this, "You clicked Red color", Toast.LENGTH_SHORT).show();
                    }
                }
        );



    }
}
