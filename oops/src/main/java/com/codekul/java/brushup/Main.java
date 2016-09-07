package com.codekul.java.brushup;

/**
 * Created by aniruddha on 6/9/16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("OOPS");
        generics();
    }

    private static void objectCreation(){
        Tyre tyre = new /* + */ Tyre();
        tyre = new /* + */ Tyre("android",90);
        tyre = new Tyre(tyre);
        tyre.projectileSpeed(10);
        tyre.projectileSpeed(12,90);
    }

    private static void inheritance(){
        TractorTyre tyre = new TractorTyre();
        tyre.projectileSpeed(12);
        tyre.putAirPressure();

        Tyre tyreOnly = new TractorTyre();
        //tyreOnly.putAirPressure();

        //TractorTyre tractorTyre = new Tyre();
    }

    private static void thisConcept(){
        KeyBoard kb = new KeyBoard();
        kb.pressKey(12);
    }

    private static void abstractClass(){
        Animal animal = new Tiger();
        animal.walk();

        Tiger tiger = new Tiger();
        tiger.walk();
    }

    private static void interfaces(){

        Bottle bottle = new Bottle();
        bottle.sip();
        bottle.fillBottle();
        bottle.emptyBottle();

        Straw straw = new Bottle();
        straw.sip();
    }

    private static void innerClasses(){

        Outer outer = new Outer();

        Outer.SimpleInner simpleInner =
                outer.new SimpleInner();

        Outer.StaticInner staticInner =
                new Outer.StaticInner();

        outer.haveOuter();

        //anonymous inner class
        Straw straw = new Straw() {
            public void sip() {
                System.out.println("Taake a sip");
            }
        };
        straw.sip();

        straw = new Bottle();
    }

    private static void exceptionHandling() throws Exception {

        Trigonometry trigonometry = new Trigonometry();
        trigonometry.acceleration(12,90);
        trigonometry.acceleration(12,0);
        trigonometry.line(6,9);
        trigonometry.line(89,9);

        trigonometry.acceleration(900);
    }

    private static void threading(){

        MyThread thread = new MyThread();
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        Thread simpleThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 100; i++){
                    System.out.println(""+i);
                }
            }
        });
        simpleThread.setPriority(Thread.NORM_PRIORITY);
        simpleThread.start();
    }

    private static void generics(){
        Generic<String> generic =
                new Generic<>();

        generic.setAny("Android");
        System.out.println("Os - "+generic.getAny());

        Generic<Tyre> tyreGen = new Generic<>();
        tyreGen.setAny(new Tyre("android",10));
        Tyre tyre = tyreGen.getAny();
    }
}
