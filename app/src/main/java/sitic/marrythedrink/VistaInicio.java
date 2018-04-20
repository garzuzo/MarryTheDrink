package sitic.marrythedrink;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;

public class VistaInicio extends AppCompatActivity {

GridViewCerveza gv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_inicio);



    }


    public void onClickCervezas(View view){

//Intent intent=new Intent(VistaInicio.this,GridViewCerveza.class);

  //      VistaInicio.this.startActivity(intent);
gv=new GridViewCerveza();
        startActivity(new Intent(VistaInicio.this,GridViewCerveza.class));
gv.setChooseCerveza(true);

    }

    public void onClickComidas(View view){
        gv=new GridViewCerveza();
        startActivity(new Intent(VistaInicio.this,GridViewCerveza.class));
        gv.setChooseCerveza(true);
    }
}
