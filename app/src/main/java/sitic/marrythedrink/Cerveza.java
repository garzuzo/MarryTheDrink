package sitic.marrythedrink;

import android.widget.ImageView;

public class Cerveza {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String name;

    private String category;
    private String brand;
    private String color;
    private String alcohol;

    private double score;
    private int sweet;
    private int salty;
    private int acid;
    private int bitter;
    private int spicy;
    private String ruta;

    public Cerveza(String id,String name, String category,String brand,String color,String alcohol, String ruta, double score, int sweet, int salty, int acid, int bitter, int spicy) {
        this.id=id;
        this.name = name;
        this.category = category;
        this.score = score;
        this.sweet = sweet;
        this.salty = salty;
        this.acid = acid;
        this.bitter = bitter;
        this.spicy = spicy;
        this.ruta = ruta;
      this.brand=brand;
         this.color=color;
        this.alcohol=alcohol;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getSweet() {
        return sweet;
    }

    public void setSweet(int sweet) {
        this.sweet = sweet;
    }

    public int getSalty() {
        return salty;
    }

    public void setSalty(int salty) {
        this.salty = salty;
    }

    public int getAcid() {
        return acid;
    }

    public void setAcid(int acid) {
        this.acid = acid;
    }

    public int getBitter() {
        return bitter;
    }

    public void setBitter(int bitter) {
        this.bitter = bitter;
    }

    public int getSpicy() {
        return spicy;
    }

    public void setSpicy(int spicy) {
        this.spicy = spicy;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }



}
