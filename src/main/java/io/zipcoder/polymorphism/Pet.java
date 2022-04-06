package io.zipcoder.polymorphism;

public abstract class Pet  {

private String name;


public String getName () {
    return name;
}


public void setName (String name) {
    this.name = name;
}


public void speak () {
    System.out.println("I'm speaking. ");
}


}
