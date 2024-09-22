package com.portafolio.bottomsheetdialogfragment;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        String parametro1 = (String) extras.get("nombre");
        String parametro2 = (String) extras.get("apellido");

        TextView parametro = (TextView) findViewById(R.id.textViewnombre);
        TextView parametro3 = (TextView) findViewById(R.id.textViewapellido);

        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + parametro1 + "]");
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + parametro2 + "]");
        parametro.setText(parametro1);

        parametro3.setText(parametro2);
    }
}