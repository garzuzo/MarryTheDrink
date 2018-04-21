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

private GridViewCerveza gv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_inicio);
        Button bCervezas= (Button) findViewById(R.id.btnCervezas);
        Button bComidas= (Button) findViewById(R.id.btnComidas);
        bCervezas.setOnClickListener(this);

        bComidas.setOnClickListener(this);
try {
    inicializarCervezas();
}catch(Exception e){
e.printStackTrace();

}
try {
   inicializarComidas();
}catch(Exception e){
    e.printStackTrace();
}


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



    BufferedReader lect = new BufferedReader(new InputStreamReader(connection.getInputStream()));

    String[] line = lect.readLine().split(";");

    for (int i=0;i<line.length;i++){

        String[] act=line[i].split(",");

        String id=act[0];
        String name=act[1];
        String category=act[2];
        String brand=act[3];
        String color=act[4];
        String alcohol=act[5];
        String ruta="b"+act[6];
        double score=Double.parseDouble(act[7]);
        int sweet=Integer.parseInt(act[8]);
        int salty=Integer.parseInt(act[9]);
        int acid=Integer.parseInt(act[10]);
        int bitter=Integer.parseInt(act[11]);
        int spicy=Integer.parseInt(act[12]);

        Cerveza cAct=new Cerveza(id,name,category,brand,color,alcohol,ruta,score,sweet,salty,acid,bitter,spicy);
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
       // setContentView(R.layout.gridview_cerveza);
        gv = new GridViewCerveza();
        Intent intent=new Intent(VistaInicio.this,gv.getClass());

      //  intent.putex
        startActivity(intent);
        finish();
        if(view.getId()==R.id.btnCervezas) {



             // startActivity(new Intent(VistaInicio.this, GridViewCerveza.class));

            //setContentView(R.layout.gridview_cerveza);

          //  gv.setChooseCerveza(true);


            cervezas=new ArrayList<>();

            comidas=new ArrayList<>();
            String msg="cervezas:\n";
            for (int i=0;i<cervezas.size();i++){
                msg+=cervezas.get(i).toString();

            }
            msg+="\ncomidas\n";
            for (int i=0;i<comidas.size();i++){
                msg+=comidas.get(i).toString();

            }
            //  gv.setChooseCerveza(true);
            gv.inicializarCervezas(cervezas,msg);
          //  tAct.setText(msg);
        }else  if(view.getId()==R.id.btnComidas) {




        //   startActivity(new Intent(VistaInicio.this, GridViewCerveza.class));



            cervezas=new ArrayList<>();

            comidas=new ArrayList<>();
            String msg="cervezas:\n";
            for (int i=0;i<cervezas.size();i++){
                msg+=cervezas.get(i).toString();

            }
            msg+="\ncomidas\n";
            for (int i=0;i<comidas.size();i++){
                msg+=comidas.get(i).toString();

            }
            gv.inicializarComidas(comidas,msg);
          //  tAct.setText(msg);
        }

    }
}
