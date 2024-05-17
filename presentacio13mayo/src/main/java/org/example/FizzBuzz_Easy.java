package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz_Easy {
    public static void main(String[] args) {


        List<Object> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to play");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 7 == 0) {
                list.add("Bazz");
            } else {
                list.add(i);
            }

        }
        System.out.println(list);
    }
}