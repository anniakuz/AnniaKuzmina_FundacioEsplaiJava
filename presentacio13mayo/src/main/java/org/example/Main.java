package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String option;
        String ans = "";

        List<String> options = List.of("parity", "sum", "about", "nothing");

        do {
            System.out.println("Choose an option: \n"
                    + "Parity \n"
                    + "Sum \n"
                    + "About\n"
                    + "Nothing");
            option = scan.nextLine().toLowerCase();

            if (options.contains(option)) {
                switch (option) {
                    case "parity":
                        System.out.println("Enter the number");
                        int number = scan.nextInt();
                        ans = Parity.isItEvenOrOdd(number);

                        break;
                    case "sum":
                        System.out.println("Enter the 1st number");
                        int number1 = scan.nextInt();
                        System.out.println("Enter the 2nd number");
                        int number2 = scan.nextInt();
                        Sum sum = new Sum(number1, number2);
                        ans = sum.sumTheNumbers();
                        break;
                    case "about":
                        System.out.println("My name is Annia. I've worked with quite a lot with Java Spring Boot \n" +
                                "using RestApi, MVC and a bit of gRPC, module and integration testings . \n" +
                                "I have experience working with MySQL, MongoDB and Redis. \n" +
                                "My knowledge with Git is not as large I would like it to be but I can get buy. \n" +
                                "I have a lot of passion for cloud technologies and I've used AWS in my latest projects \n" +
                                " as well as Docker. \n" +
                                "Also I have some knowledge of Javascript, React, Golang.");
                        break;
                }

                System.out.println(ans);
                scan.nextLine();
            } else {
                System.out.println("!!! This option is not valid !!!");
            }
        } while (option != "nothing") ;


            }

    }
