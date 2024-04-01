package OOP_Advance;

import java.util.Scanner;

/*1. Area of Rectangle using Abstraction

Create a program to calculate the area of a rectangle*/
abstract class Polygon {
    abstract void calculateArea();
}

class Rectangle extends Polygon{

    int length;
    int breadth;

    Rectangle( int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    void calculateArea() {
       int area = length * breadth;
        System.out.println("Area of recatngle : " + area);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value for length: ");
        int length = input.nextInt();

        System.out.println("Please enter a value for breath: ");
        int breadth = input.nextInt();

        Rectangle rect = new Rectangle(length, breadth);
        rect.calculateArea();

        input.close();

    }
}
