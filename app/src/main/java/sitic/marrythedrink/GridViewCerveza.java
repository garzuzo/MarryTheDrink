package sitic.marrythedrink;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.TextView;

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
public GridViewCerveza(){

}
    public void inicializarComidas(ArrayList<Comida> arr,String m) {

        despliegueComidas=arr;

        gridView = (GridView) findViewById(R.id.gridViewCerveza);
        gAdapter = new GridAdapter(this,chooseCerveza,despliegueComidas);

        gridView.setAdapter(gAdapter);
        TextView tAct=(TextView) findViewById(R.id.txtBuscar);
        tAct.setText("Busca tu comida"+m);
    }
    public void inicializarCervezas(ArrayList<Cerveza> arr,String m) {

        despliegueCervezas=arr;
        ((Activity) this).setContentView(R.layout.gridview_cerveza);

        gridView = (GridView) findViewById(R.id.gridViewCerveza);

        gAdapter = new GridAdapter(this,chooseCerveza,despliegueCervezas);
        gridView.setAdapter(gAdapter);
        TextView tAct=(TextView) findViewById(R.id.txtBuscar);
        tAct.setText("Busca tu cerveza"+m);
    }
}
