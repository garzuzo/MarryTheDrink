package sitic.marrythedrink;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class GridViewCerveza extends AppCompatActivity {
    private GridView gridView;
    private GridAdapter gAdapter;

    public boolean isChooseCerveza() {
        return chooseCerveza;
    }

    public void setChooseCerveza(boolean chooseCerveza) {
        this.chooseCerveza = chooseCerveza;
    }

    private boolean chooseCerveza;

    private ArrayList<Cerveza> despliegueCervezas;

    private ArrayList<Comida>despliegueComidas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_cerveza);

        gridView = (GridView) findViewById(R.id.gridViewCerveza);


        chooseCerveza=false;
    }

    public void inicializarComidas(ArrayList<Comida> arr) {

        despliegueComidas=arr;
        gAdapter = new GridAdapter(this,chooseCerveza);
        gridView.setAdapter(gAdapter);
    }
    public void inicializarCervezas(ArrayList<Cerveza> arr) {

        despliegueCervezas=arr;
        gAdapter = new GridAdapter(this,chooseCerveza);
        gridView.setAdapter(gAdapter);
    }
}
