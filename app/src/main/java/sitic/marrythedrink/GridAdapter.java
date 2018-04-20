package sitic.marrythedrink;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter{

    private Context context;
    private ArrayList<Cerveza> listaCervezas;
    private ArrayList<Comida> listaComidas;
private boolean isCerveza;


    public GridAdapter(Context context,boolean isCerveza){
        this.context= context;
        this.isCerveza=isCerveza;
        if(isCerveza)
        this.listaCervezas=listaCervezas;
        else
            this.listaComidas=listaComidas;
    }

    @Override
    public int getCount() {
        return isCerveza?listaCervezas.size():listaComidas.size();
    }

    @Override
    public Object getItem(int i) {
        return  isCerveza?listaCervezas.get(i):listaComidas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
           view = layoutInflater.inflate(R.layout.vistas,null);
        }

if(listaCervezas!=null) {
    TextView nombre = (TextView) view.findViewById(R.id.tvPuntaje);
    nombre.setText(listaCervezas.get(i).getName());
      ImageView imagen = view.findViewById(R.id.ivCerveza);
    String ruta=listaCervezas.get(i).getRuta();
    Context context=imagen.getContext();
    int idImg=context.getResources().getIdentifier(ruta,"drawable",context.getPackageName());
imagen.setImageResource(idImg);




       TextView puntaje = view.findViewById(R.id.tvPuntaje);
     puntaje.setText(listaCervezas.get(i).getScore() +"");
}else{
    TextView nombre = (TextView) view.findViewById(R.id.tvPuntaje);
    nombre.setText(listaComidas.get(i).getName());
    ImageView imagen = view.findViewById(R.id.ivCerveza);
    String ruta=listaComidas.get(i).getRuta();
    Context context=imagen.getContext();
    int idImg=context.getResources().getIdentifier(ruta,"drawable",context.getPackageName());
    imagen.setImageResource(idImg);




    TextView puntaje = view.findViewById(R.id.tvPuntaje);
    puntaje.setText(listaComidas.get(i).getScore() +"");


}
        return view;
    }
}
