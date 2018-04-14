package sitic.marrythedrink;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class GridViewCerveza extends AppCompatActivity {
    private GridView gridView;
    private GridAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_cerveza);

        gridView= (GridView)findViewById(R.id.gridViewCerveza);
    }
}
