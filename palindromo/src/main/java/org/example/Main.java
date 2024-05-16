package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a chain of Strings");
        String chain =scan.nextLine();
        scan.close();
        if(isPalindromeFunction(chain)){
            System.out.println("the chain is a palindrome");
        } else{
            System.out.println("the chain is not a palindrome");
        }
    }

    public static boolean isPalindromeFunction(String chain){
        boolean isPalindrome = false;
        String reverse = new StringBuilder(chain.toLowerCase()).reverse().toString();
        if(reverse.equals(chain)) isPalindrome = true;
        return isPalindrome;
    }
}