package com.codekul.java.brushup;

/**
 * Created by aniruddha on 7/9/16.
 */
//tractor tyre is a tyre
public class TractorTyre extends Tyre{

    @Override
    public int projectileSpeed(int distance) {

        int speed = distance
                    * getDiameter()
                    * super.projectileSpeed(distance);
        return speed;
    }

    public void putAirPressure(){
        diameter += 5;
    }
}
