package otherExample.OOP.constructor.ex1;

public class Cat {

    //private instance name
    private final String name;
    private final int age;

    //default contructor
    public Cat(){
        this.name = "Unknow";
        this.age = 0;
    }

    //main method to test the Cat class
    public static void main(String[] args){
        //create a new Cat object using the default constructor
        Cat myCat = new Cat();

        //print the value of the instance variables
        System.out.println("Cat's Name: " + myCat.name);
        System.out.println("Cat's age: " + myCat.age);
    }
}
