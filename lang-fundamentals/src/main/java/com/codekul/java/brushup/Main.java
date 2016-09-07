package com.codekul.java.brushup;

import java.util.Arrays;

/**
 * Created by aniruddha on 6/9/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Language Fundamentals");

        array();

        conditionals();
    }

    private static void array(){

        int []nums = {1,2,3,6,78};
        //nums  = new int[3];

        String []strs = {"India","Chinna","Japan"};
        //strs = new String[3];

        for(int i = 0 ; i <  nums.length ;i ++)
            System.out.println("Num - "+nums[i]);

        for (String str : strs)
            System.out.println("Str - "+str);
    }

    private static void conditionals(){
        int i = 10;
        if(i == 10) System.out.println("Okay");
        else if(i >= 10) System.out.println("Good");
        else System.out.println("Excellent");
    }
}
