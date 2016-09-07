package com.codekul.java.brushup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Function;

/**
 * Created by aniruddha on 7/9/16.
 */
public class MyCollection {

    public static void simpleCollection(){

        Collection<String> collection =
                new ArrayList<>();

        collection.add("Android");
        collection.add("Java");
        collection.add("Apple");
        collection.add("Rim");

        /*for(int i = 0 ; i < collection.size() ;i++)
            collection.get(i);*/

        for (String s : collection) {
            System.out.println("Foreach  -"+s);
        }

        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println("Iterator -"+s);
        }

        collection.forEach(System.out::print); // java8
    }
}
