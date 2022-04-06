package io.zipcoder.polymorphism;
/*
Modify your program from part 1 to use the Pet class and its subclasses.
Keep a list of the pets your user lists
and at the end of the program print out a list of their names and what they say when they speak.
 */

public class Main {
    public static void main(String[] args) {

        Pet cat1 = new Cat ("Ben");
        Pet dog1 = new Dog("Bob");
        Pet cow1 = new Cow("Spot");



        System.out.println(dog1.getName());
        System.out.println(cow1.getName());
        System.out.println(cat1.getName());

        Pet [] pets = {dog1,cow1,cat1 };
        for (Pet p:pets ) {
            p.speak();
        }

    }

}

/*
he wanted us to take user input and use that to make Objects from Pets and the Pets subclasses and print it all out at the end.
To give you a nudge in the right direction, the way I did it used Object arrays if you want to look into that.
 */
