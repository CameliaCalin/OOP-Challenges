package OOP_Basics;

import java.util.Scanner;

/*Create a program to find the area of a rectangle.*/
class Rectangle {
    //integer fields
    int length;
    int breadth;

    //constructor of the class
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    //method to compute the area of rectangle
    void calculateArea(){
        int area = length * breadth;
        System.out.println(area);
    }

}

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        //create object of rectangle with arguments x and y
        Rectangle rectangle = new Rectangle(x, y);
        rectangle.calculateArea();

        input.close();
    }
}
