package com.codekul.java.brushup;

/**
 * Created by aniruddha on 6/9/16.
 */
public class Tyre {

    private String company; // state-> field -> data -> property
    protected int diameter;

    public Tyre(){
        // default
        company = "codekul";
        diameter = 10;
    }

    public Tyre(String com, int dia){
        // parametrized
        company = com;
        diameter = dia;
    }

    public Tyre(Tyre tyre){
        // copy
        company = tyre.getCompany();
        diameter = tyre.getDiameter();
    }

    public void setDiameter(int dim){
        diameter = dim;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getCompany() {
        return company;
    }

    //Encapsulation
    public void projectileSpeed(int distance, int time){ //behaviour -> methods -> functions
        int speed = (distance / time) * diameter;
    }

    //polymorphism
    public int projectileSpeed(int distance){
        return 0;
    }
}
