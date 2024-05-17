package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Sum {

    private int x;
    private int y;

    public String sumTheNumbers(){
        int sum = x +y;
        return "The sum of numbers " + x + " and " + y +" is " + sum;
    }

}
