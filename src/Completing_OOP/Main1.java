package Completing_OOP;
/*1. Overload Final Method

Create a program to overload a final method.*/
// Replace ___ with your code
import java.util.Scanner;

class Main1 {

    // create a final method setName() without any parameter
    // print Programiz inside the method
    final void setName() {
        System.out.println("Programiz");
    }

    // create a final method setName() with a string parameter name
    final void setName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {

        // create an object of Main
        Main1 obj =  new Main1();

        // get input value for the name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // call setName() without any argument
        obj.setName();

        // call setName with the name argument
        obj.setName(name);

        input.close();
    }
}
