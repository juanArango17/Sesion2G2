package com.programacionmoviles.juanpabloarangoa.sesion2g2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eNombre, eCorreo;
    CheckBox cNadar, cVideojuegos, cDormir;
    Button bGuardar;
    String tAux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /********************interacción xml <-> java*******************/
        eNombre  = findViewById(R.id.eNombre);
        eCorreo  = findViewById(R.id.eCorreo);

        cNadar       = findViewById(R.id.cNadar);
        cVideojuegos = findViewById(R.id.cVideojuegos);
        cDormir      = findViewById(R.id.cDormir);
        //bGuardar = findViewById(R.id.bGuardar);
        /***************************************************************/
        /*bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tAux = eNombre.getText().toString();
               eNombre.setText(eCorreo.getText().toString());
               eCorreo.setText(tAux);

            }
        });*/
    }

    public void onButtonGuardar(View view) {
        tAux = eNombre.getText().toString();
        eNombre.setText(eCorreo.getText().toString());
        eCorreo.setText(tAux);
    }

    public void onRadioButtonClicked(View view) {
        int id=view.getId();
    }

    public void onCheckboxClicked(View view) {
        int id = view.getId();
        switch (id){
            case R.id.cNadar:
                if(cNadar.isChecked()){
|
                }
                break;
            case R.id.cVideojuegos:
                if(cVideojuegos.isChecked()){

                }
                break;
            case R.id.cDormir:
                if(cDormir.isChecked()){

                }
                break;
        }
    }
}/*Faltan las ciudades y daypicker---------rev. 15/02/18*/
