package sitic.marrythedrink;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import android.widget.Button;
import android.widget.TextView;
import java.io.*;

public class VistaInicio extends AppCompatActivity implements View.OnClickListener {


private ArrayList<Cerveza> cervezas;
private ArrayList<Comida>comidas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_inicio);
        Button bCervezas= (Button) findViewById(R.id.btnCervezas);
        Button bComidas= (Button) findViewById(R.id.btnComidas);
        bCervezas.setOnClickListener(this);

        bComidas.setOnClickListener(this);


    }

public void inicializarCervezas()throws IOException{
cervezas=new ArrayList<Cerveza>();

    URL url =new URL ("http://sitic.emedia.co/cervezas.php"); //URL!
    HttpURLConnection connection=(HttpURLConnection)url.openConnection();
    connection.setRequestMethod("GET");
    connection.setDoOutput(true);
    connection.setConnectTimeout(5000);
    connection.setReadTimeout(5000);
    connection.connect();


    String result = "";

    BufferedReader lect = new BufferedReader(new InputStreamReader(connection.getInputStream()));

    String[] line = lect.readLine().split(";");

    for (int i=0;i<line.length;i++){

        String[] act=line[i].split(",");

        String id=act[0];
        String name=act[1];
        String category=act[1];
        String ruta="b"+act[0];
        double score=Double.parseDouble(act[2]);
        int sweet=Integer.parseInt(act[3]);
        int salty=Integer.parseInt(act[4]);
        int acid=Integer.parseInt(act[5]);
        int bitter=Integer.parseInt(act[6]);
        int spicy=Integer.parseInt(act[7]);

        Cerveza cAct=new Cerveza(id,name,category,ruta,score,sweet,salty,acid,bitter,spicy);
        cervezas.add(cAct);
    }


}

public void inicializarComidas()throws Exception{
    comidas=new ArrayList<Comida>();
    URL url =new URL ("http://sitic.emedia.co/comidas.php"); //URL!
    HttpURLConnection connection=(HttpURLConnection)url.openConnection();
    connection.setRequestMethod("GET");
    connection.setDoOutput(true);
    connection.setConnectTimeout(5000);
    connection.setReadTimeout(5000);
    connection.connect();



    BufferedReader lect = new BufferedReader(new InputStreamReader(connection.getInputStream()));

    String[] line = lect.readLine().split(";");

    for (int i=0;i<line.length;i++){

        String[] act=line[i].split(",");

        String id=act[0];
        String name=act[1];
        String category=act[1];
        //c+id, definir ruta de imagenes
        String ruta="c"+act[0];
        double score=Double.parseDouble(act[2]);
        int sweet=Integer.parseInt(act[3]);
        int salty=Integer.parseInt(act[4]);
        int acid=Integer.parseInt(act[5]);
        int bitter=Integer.parseInt(act[6]);
        int spicy=Integer.parseInt(act[7]);

        Comida cAct=new Comida(id,name,category,ruta,score,sweet,salty,acid,bitter,spicy);

        comidas.add(cAct);
    }


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
