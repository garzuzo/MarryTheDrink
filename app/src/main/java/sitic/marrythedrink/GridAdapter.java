package sitic.marrythedrink;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import android.content.Context;

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
        return null;
    }
}
