package io.zipcoder.polymorphism;

import java.util.Scanner;

public  class PetHouse {

        public static void main(String args[]) {


            double userInput;
            int x;
            String input;


            Scanner scan = new Scanner(System.in);
            System.out.println("How many pets do you have:");
            userInput = scan.nextDouble();

            while (true) {
                for (x = 1; x <= userInput; x++) {

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("What kind of pet is pet # " + x + "?");
                   input = scanner.next();
                    System.out.println("Please enter the name of pet # " + x + ":");
                    input = scanner.next();

                }
                break;
            }
        }
    }
