package Inheritance;

import java.util.Scanner;

/*Implement Multilevel Inheritance

Create a program to implement multilevel inheritance.*/
 class Animal3 {
     void eat(){
         System.out.println("I eat animal food");
     }
}

class Mammal extends Animal3 {
     void display(){
         System.out.println("I am a mammal");
     }
}

class Dog3 extends Mammal {
     void displayName(String name){
         System.out.println("My name is " + name + ".");
     }
}

class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        Dog3 labrador = new Dog3();

        //call displayName()

        labrador.displayName(name);

        //call display() and eat ();
        labrador.eat();
        labrador.display();

        input.close();
    }
}
