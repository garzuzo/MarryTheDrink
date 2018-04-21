package sitic.marrythedrink;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

import android.view.View;
import android.widget.GridView;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class InfoCerveza extends AppCompatActivity{
    ListView listView;

    boolean isCerveza;
    private Comida[] arrayC;
    private Cerveza[] arrayCerv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infocerveza);

        listView = (ListView)findViewById(R.id.listCB);

        if(isCerveza){
            arrayC = arrayComidas();
            ArrayAdapter<Comida> adapter1 = new ArrayAdapter<Comida>(this, android.R.layout.simple_expandable_list_item_1, arrayC);

            listView.setAdapter(adapter1);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Comida comida= (Comida)listView.getSelectedItem();
                    String mens = "Nombre: " + comida.getName() + "\n" + "Puntaje: " + comida.getScore()+ "Acido: " + "\n" + comida.getAcid() +"\n" + "Amargo: " +comida.getBitter() +
                            "Salado: " +comida.getSalty()+ "\n" +   "Picante: " + comida.getSpicy() + "\n" + "Dulce: " +comida.getSweet();
                    Toast.makeText(getApplicationContext(), mens,Toast.LENGTH_LONG).show();
                }
            });
        }
        else{
            arrayCerv = arrayCervezas();
            ArrayAdapter<Cerveza> adapter2 = new ArrayAdapter<Cerveza>(this, android.R.layout.simple_expandable_list_item_1, arrayCerv);

            listView.setAdapter(adapter2);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Cerveza comida= (Cerveza)listView.getSelectedItem();
                    String mens = "Nombre: " + comida.getName() + "\n" + "Puntaje: " + comida.getScore()+ "Acido: " + "\n" + comida.getAcid() +"\n" + "Amargo: " +comida.getBitter() +
                            "Salado: " +comida.getSalty()+ "\n" +   "Picante: " + comida.getSpicy() + "\n" + "Dulce: " +comida.getSweet();
                    Toast.makeText(getApplicationContext(), mens,Toast.LENGTH_LONG).show();
                }
            });
        }



    }

    public Comida[] arrayComidas(){
        //lo del profe
        Comida[] c = new Comida[5];
        c[0] = new Comida("1", "comida1", "categoria1", "", 20, 5 , 3 , 3, 3, 7);
        return c;
    }

    public Cerveza[] arrayCervezas(){
        //lo del profe
        Cerveza[] c = new Cerveza[5];
        return c;
    }

}
