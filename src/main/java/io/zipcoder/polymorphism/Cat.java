package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat (String name) { }

    @Override
    public void speak () {
        System.out.println("Meow-Meow");
    }

}
