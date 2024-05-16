package org.example;

import java.util.Scanner;

public class Parity {

    public static String isItEvenOrOdd(int number){
        String result;

        if(number%2 == 0){
            result = "The number is even";
        }else{
            result = "The number is odd";
        }

        return result;
    }


}
