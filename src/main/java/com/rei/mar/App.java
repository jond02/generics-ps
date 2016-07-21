package com.rei.mar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jdann on 7/20/16.
 */
public class App {

    public static void main(String[] args) {

        CircularBuffer<String> buffer = new CircularBuffer<>(10);

        buffer.offer("yes");
        buffer.offer("new");
        buffer.offer("cool");

        String value = concatenate(buffer);
        System.out.println(value);

    }

    private static String concatenate(CircularBuffer<String> buffer){

        StringBuilder result = new StringBuilder();
        String value;

        while((value = buffer.poll()) != null){
            result.append(value);
        }

        return result.toString();
    }

}
