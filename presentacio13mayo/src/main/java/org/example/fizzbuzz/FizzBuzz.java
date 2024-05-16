package org.example.fizzbuzz;

import java.util.*;

public class FizzBuzz {
    static Scanner scan = new Scanner(System.in);
    static HashMap<Integer, String> dividers = new HashMap<>();
    public static void main(String[] args) {



      /*

         // Assigning values for the 2nd divider and its replacing word

        do {
            System.out.println("Enter the 2nd positive divider number");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number, enter a positive number");
                scan.next();
            }
            divider1 = scan.nextInt();
        } while (number <= 0);
        System.out.println("Enter your replacing word ");
        word2 = scan.nextLine();


         //Assigning values for the 3rd divider and its replacing word

        do {
            System.out.println("Enter the 3rd positive divider number");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number, enter a positive number");
                scan.next();
            }
            divider1 = scan.nextInt();
        } while (number <= 0);
        System.out.println("Enter your replacing word ");
        word3 = scan.nextLine();
 */
        /**
         *Proceeding with FizzBuzz game
         * @return result in a list
         */
        List<Object> result = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (i % divider1 == 0){
                result.add(word1);
            }
            if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(i);
            }
        }

        System.out.println(result);

    }

    /**
     * Validating only positive numbers
     */
    public static void validatingNumberTotal() {
        int numberTotal;
        do {
            System.out.println("Enter a positive number");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number, enter a positive number");
                scan.next();
            }
            numberTotal = scan.nextInt();
        } while (numberTotal <= 0);
    }

    /**
     * checking if the divider is already existing in a hashmap
     */

    public static boolean checkingDivider(int num){

    }

    /**
     * Assigning values for the 1st divider and its replacing word
     */

    public static void assigningValuesForDivider() {
        int divider;
        do {
            System.out.println("Enter the 1st positive divider number");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number, enter a positive number");
                scan.next();
            }
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number, enter a positive number");
                scan.next();
            }



        } while (divider <= 0);
        System.out.println("Enter your replacing word ");
        String word = scan.nextLine();
        dividers.put(divider, word);
    }
}
