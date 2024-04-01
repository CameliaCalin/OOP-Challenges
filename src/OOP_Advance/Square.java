package OOP_Advance;
/* 6. Area of Square using Encapsulation

Create a program to calculate the area of a square using encapsulation. */
import java.util.Scanner;

// create a class named Square
class Square {

    // create a private field
    private int length;

    // setter method
    public void setLength(int length) {
        // condition to check if length is greater than 0
        // if true, assign value of length to the private field length using this
        // otherwise, print Length of a square cannot be less than 0.
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length of a square cannot be less than 0.");
        }
    }

    // create method to calculate area and print it
    public void calculateArea() {
        int area = length * length;
        System.out.println("Area of the square: " + area);
    }
}

class Main6 {
    public static void main(String[] args) {

        // get input value for length
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        // create an object of Square
        Square squareObj = new Square();

        // call the setter method with the length argument
        squareObj.setLength(length);

        // call the calculateArea() method
        squareObj.calculateArea();

        input.close();
    }
}

