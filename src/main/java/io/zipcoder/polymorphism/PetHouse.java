package io.zipcoder.polymorphism;

import java.util.Scanner;

/*
Create a program that asks the user how many pets they have.
Once you know how many pets they have, ask them what kind of pet each one is,
along with each pet's name. For now your program should just hold onto the user input
and print out the list at the end; we'll modify this in part 3.
 */
public class Pet {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter how many pets you have:");

        int numOfPets = 0;

        System.out.println("What is the name of animal number " + numOfPets);
    }
}
