package sitic.marrythedrink;

import android.widget.ImageView;

public class Cerveza {

    private String imagenCerveza;
    private String nombreCerveza;
    private double puntaje;

    public  Cerveza(String imagenCerveza, String nombreCerveza, int puntaje){

        this.imagenCerveza= imagenCerveza;
        this.nombreCerveza = nombreCerveza;
        this.puntaje= puntaje;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public String getImagenCerveza() {
        return imagenCerveza;
    }

    public String getNombreCerveza() {
        return nombreCerveza;
    }
}
