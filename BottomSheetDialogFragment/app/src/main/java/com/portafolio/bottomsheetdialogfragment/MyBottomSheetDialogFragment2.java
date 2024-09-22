package com.portafolio.bottomsheetdialogfragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

interface BottomSheetListener {
    void onItemClick(String item);
}

public class MyBottomSheetDialogFragment2 extends BottomSheetDialogFragment {
    private BottomSheetListener listener;

    public static MyBottomSheetDialogFragment2 newInstance() {
        return new MyBottomSheetDialogFragment2();
    }

    public void setBottomSheetListener(BottomSheetListener listener) {
        this.listener = listener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom_sheet2, container, false);

        view.findViewById(R.id.button3).setOnClickListener(v -> {
            listener.onItemClick("Item 1 clicked");
            dismiss(); // Ocultar el BottomSheet
            EditText  editText = view.findViewById(R.id.editTextText);
            String nombre = editText.getText().toString();
            EditText  editText2 = view.findViewById(R.id.editTextText2);
            String apellido = editText2.getText().toString();
            Intent i = new Intent(getContext(), MainActivity2.class);
            i.putExtra("nombre", nombre);
            i.putExtra("apellido", apellido);
            getContext().startActivity(i);
        });


        // Más lógica...
        return view;
    }
}
