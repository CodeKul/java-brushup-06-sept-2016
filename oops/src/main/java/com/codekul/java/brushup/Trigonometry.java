package com.codekul.java.brushup;

/**
 * Created by aniruddha on 7/9/16.
 */
public class Trigonometry {

    private int result;

    public void simple(int angle) {
        result = (int) ((Math.sin(angle) * Math.sin(angle)) +  (Math.cos(angle) * Math.cos(angle)));
        System.out.println("Simple - "+result);
    }

    public void line(int mx, int c){
        result = mx + c;
        System.out.println("Line - "+result);
    }

    public void acceleration( int force, int mass) {
        // f = ma
        try {
            result = force/mass; // throw new ArithmeticException();
            System.out.println("Acceleration - "+result);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        catch (Throwable t){
            t.printStackTrace();
        }
    }

    public void acceleration( int mass) throws ArithmeticException,Exception{

        if(mass <= 0) throw new MyException();

        result = 100/mass;
    }
}
