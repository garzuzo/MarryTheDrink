package sitic.marrythedrink;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;
import android.widget.Button;
import android.widget.TextView;

public class VistaInicio extends AppCompatActivity implements View.OnClickListener {




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_inicio);
        Button bCervezas= (Button) findViewById(R.id.btnCervezas);
        Button bComidas= (Button) findViewById(R.id.btnComidas);
        bCervezas.setOnClickListener(this);

        bComidas.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnCervezas) {
         //   gv = new GridViewCerveza();


              startActivity(new Intent(VistaInicio.this, GridViewCerveza.class));

            setContentView(R.layout.gridview_cerveza);
            TextView tAct=(TextView) findViewById(R.id.txtBuscar);
            tAct.setText("Busca tu cerveza");
           // gv.setChooseCerveza(true);
          //  gv.setChooseCerveza(true);
        }else  if(view.getId()==R.id.btnComidas) {
          //  gv = new GridViewCerveza();


        //   startActivity(new Intent(VistaInicio.this, GridViewCerveza.class));
            setContentView(R.layout.gridview_cerveza);
           TextView tAct=(TextView) findViewById(R.id.txtBuscar);
           tAct.setText("Busca tu comida");
        }
    }
}
