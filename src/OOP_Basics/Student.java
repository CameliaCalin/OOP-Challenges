package OOP_Basics;

import java.util.Scanner;

/*Create a program to access and modify the private member using the getter and setter method.*/
 class Student {
     //create private field
    private String name;

    //setter method
    public void setName(String name){
        System.out.println("Setting name");
        //initialize value of name using this
        this.name = name;
    }

    //getter method
    public String getName(){
        System.out.println("Getting name");
        //return the value of name using this
        return this.name;
    }
}

class Main5 {
    public static void main(String[] args) {
        //get input for name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        //create object
        Student student = new Student();
        student.setName(name);

        //call getter method
        String returnedValue = student.getName();

        System.out.println(returnedValue);
    }
}
