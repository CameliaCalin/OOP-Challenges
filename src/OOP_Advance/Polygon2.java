package OOP_Advance;

import java.util.Scanner;

/*2/ Implement Interface

Create a program to implement an interface.*/
interface Polygon2 {
    void calculateArea();
}

class Square1 implements Polygon2 {
    int length;

    Square1(int length){
        this.length = length;
    }


    public void calculateArea(){
        int area = length * length;
        System.out.println("Area of square: " + area);
    }
}

class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value for square's length:" );
        int length = input.nextInt();

        Square1 square1 = new Square1(length);
        square1.calculateArea();

        input.close();
    }
}