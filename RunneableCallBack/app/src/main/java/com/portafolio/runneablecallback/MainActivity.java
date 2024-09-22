package com.portafolio.runneablecallback;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    private Handler mHandler = new Handler();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = findViewById(R.id.TV);

        // Ejecutar la tarea
        MyRunnable myRunnable = new MyRunnable(new Task() {
            @Override
            public String execute() {
                String text = "";
                for (int i = 1; i < 1000; i++) {
                    for (int j = 1; j < 100; j++) {
                        if (j % i == 0) {
                            text = (j) + "-" + text;
                        }
                    }
                }
                return text;
            }
        },new Callback() {
            @Override
            public void onTaskCompleted(String result) {
                tvText.setText(result);
            }

            @Override
            public void onTaskFailed(String e) {

            }

        }

        ,
                this);
        new Thread(myRunnable).start();
    }

}