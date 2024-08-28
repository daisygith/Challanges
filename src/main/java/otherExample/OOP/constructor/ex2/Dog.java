package otherExample.OOP.constructor.ex2;

public class Dog {

    private final String name;
    private final String color;

    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args){
        //create a new Cat object using the default constructor
        Dog myDog = new Dog("Reksio", "white");

        //print the value of the instance variables
        System.out.println("Dog's Name: " + myDog.name);
        System.out.println("Dog's color: " + myDog.color);
    }

}
