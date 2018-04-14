package sitic.marrythedrink;

import android.widget.ImageView;

public class Cerveza {

    private ImageView imagenCerveza;
    private String nombreCerveza;
    private double puntaje;

    public  Cerveza(ImageView imagenCerveza, String nombreCerveza, int puntaje){

        this.imagenCerveza= imagenCerveza;
        this.nombreCerveza = nombreCerveza;
        this.puntaje= puntaje;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public ImageView getImagenCerveza() {
        return imagenCerveza;
    }

    public String getNombreCerveza() {
        return nombreCerveza;
    }
}
