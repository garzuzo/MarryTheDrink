package sitic.marrythedrink;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class GridViewCerveza extends AppCompatActivity {
    private GridView gridView;
    private GridAdapter adapter;

    private ArrayList<Cerveza> arr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_cerveza);

        gridView = (GridView) findViewById(R.id.gridViewCerveza);
        arr = new ArrayList<Cerveza>();
        llenarListaCervezas();
        GridAdapter gAdapter = new GridAdapter(this, arr);
        gridView.setAdapter(gAdapter);

    }

    public void llenarListaCervezas() {

        for (int i = 1; i <= 5; i++) {

            String url="@drawable/c"+i+".jpg";
            Cerveza cActual = new Cerveza(url, "BBC Miel", i);
            arr.add(cActual);

        }
    }
}
