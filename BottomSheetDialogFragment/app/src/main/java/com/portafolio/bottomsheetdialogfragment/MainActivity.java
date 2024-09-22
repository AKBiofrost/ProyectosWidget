package com.portafolio.bottomsheetdialogfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            /*
            MyBottomSheetDialogFragment bottomSheet = MyBottomSheetDialogFragment.newInstance();
            bottomSheet.show(getSupportFragmentManager(), bottomSheet.getTag());
        */
            MyBottomSheetDialogFragment2 bottomSheet = MyBottomSheetDialogFragment2.newInstance();
            bottomSheet.setBottomSheetListener(item -> {
                // Manejar el evento de clic en el BottomSheet
                Toast.makeText(this, item, Toast.LENGTH_SHORT).show();
            });
            bottomSheet.show(getSupportFragmentManager(), bottomSheet.getTag());

        });

        /*-----------------------------------------------------------------------------*/


    }
}