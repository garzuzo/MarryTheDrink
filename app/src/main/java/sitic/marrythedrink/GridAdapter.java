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
    private ArrayList<Cerveza> lista;
    public GridAdapter(Context context, ArrayList<Cerveza> lista){
        this.context= context;
        this.lista=lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
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


        TextView nombre = (TextView) view.findViewById(R.id.tvPuntaje);
        nombre.setText(lista.get(i).getNombreCerveza());

        ImageView imagen = view.findViewById(R.id.ivCerveza);
       // int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        //imagen.setImageDrawable(lista.get(i).getImagenCerveza());
        imagen.setImageResource(R.drawable.c3);
        String r=lista.get(i).getImagenCerveza();


        TextView puntaje = view.findViewById(R.id.tvPuntaje);
        puntaje.setText(lista.get(i).getPuntaje() +"");
        return view;
    }
}
