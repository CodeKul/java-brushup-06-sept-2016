package com.codekul.java.brushup;

/**
 * Created by aniruddha on 7/9/16.
 */
public class Bottle implements Straw {

    private int level;

    public void sip() {
        level -= 1;
        System.out.println("Level - "+level);
    }

    public void fillBottle(){
        level  = 100;
    }

    public void emptyBottle(){
        level = 0;
    }
}
