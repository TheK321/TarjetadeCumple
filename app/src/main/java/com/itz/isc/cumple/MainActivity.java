package com.itz.isc.cumple;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button boton,aceptar;
    TextView txtfel, txtdeq;
    // Mario Martínez Arteaga
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.btnDatos);
        txtfel = findViewById(R.id.txtFelicidades);
        txtdeq = findViewById(R.id.txtDepartede);
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
// ...Irrelevant code for customizing the buttons and title
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.lyt_info, null);
        aceptar = dialogView.findViewById(R.id.btnaceptar);
        dialogBuilder.setView(dialogView);

        EditText dequien = (EditText) dialogView.findViewById(R.id.et_deq);
        EditText paraquien = (EditText) dialogView.findViewById(R.id.et_para);
        AlertDialog alertDialog = dialogBuilder.create();
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.show();
            }
        });
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            txtfel.setText("Felicidades:"+paraquien.getText().toString());
            txtdeq.setText("De: "+dequien.getText().toString());
            }
        });


    }


}