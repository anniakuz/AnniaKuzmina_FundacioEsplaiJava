package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This app allow to enter how many divider are going to be used. Then it creates an object Divider
 * with the 'unic number' and the word and keeps these object in the list.
 */


public class FizzBuzz {
    static Scanner scan = new Scanner(System.in);
    static List<Divider> dividers = new ArrayList<>();
    public static void main(String[] args) {

        int playNumber = askingForANumberToPlay();

        // method allows to enter how many dividers are going to be used
        int numberOfDividers = askingForANumberOfDividers();

        //creating and adding Divider object to the list
        for (int i = 1; i <= numberOfDividers; i++) {
            assigningValuesForDivider(i);
        }

        System.out.println(playGame(playNumber));

    }

    /**
     * Asking a user to enter a number with which the game will be played
     * @return
     */

    public static int askingForANumberToPlay(){
        int numberPlay = 0;
        while(numberPlay<=5) {
            System.out.println("Enter the positive divider number to play, has to be at least 5");
            numberPlay = scan.nextInt();
        }
        return numberPlay;
    }

    /**
     * asking a user to enter the number (quantity) of divider for the game
     * @return
     */
    public static int askingForANumberOfDividers(){
        int numberDivider;
        do{
            System.out.println("Enter the number of dividers you wanna use, at least 1");
            numberDivider = scan.nextInt();
        }while(numberDivider==0);

            return numberDivider;
    }

    /**
     * Making checkings for the number of a class Divider, has to be more than zero and positive number
     * Checking if there is already a Divider object with the same number
     * After that adding an Divider object to the list
     * @param numberDivider
     */
    public static void assigningValuesForDivider(int numberDivider) {
        int divider = 0;
        boolean checked = false;

        //while loop until checked is true in 77 line
        while(!checked){
            //checking if the input is a positive number
            do {
                System.out.println("Enter the " + numberDivider +" positive divider number");
                    while (!scan.hasNextInt()) {
                    System.out.println("That's not a number, enter a positive number");
                    scan.next();
                    }
                divider = scan.nextInt();
                }while (divider <= 0);


                //checking if the number has already been added to a list
                int finalDivider = divider;
                if(dividers.stream().anyMatch(d -> d.getNumber()== finalDivider)){
                    System.out.println("This number is already been using, enter an other one");
                }else checked = true;

        }

        System.out.println("Enter your replacing word ");
        String word = scan.next();
        dividers.add(new Divider(divider, word));
    }

    /**
     *Proceeding with FizzBuzz game using a for loop
     * In case we find that a number (i) is a multiple of (j), the number is replaced with an according word
     * and added to the list. Boolean match is changed to true to avoid adding the actual number.
     * If not, we keep the number as it is and add it to the list
     * @return result in a list
     */
    public static List<Object> playGame(int playNumber){
        List<Object> result = new ArrayList<>();

        for (int i = 1; i <= playNumber ; i++){
            boolean match = false;
            for (int j = 0; j < dividers.size(); j++) {
                if (i % dividers.get(j).getNumber() == 0) {
                    match = true;
                    result.add(dividers.get(j).getWord());
                }
            }
            if(!match){
                result.add(i);
            }
        }
            return result;

    }

    }

