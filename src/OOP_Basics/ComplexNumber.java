package OOP_Basics;

import java.util.Scanner;

/*Create a program to add complex numbers.

Complex numbers are expressed in the form of 5 + 8i,
where 5 is the real part and 8i is the imaginary part.*/
class ComplexNumber {
    //create fields
    double real;
    double imag;

    //constructor
    ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
}

class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input for the first complex number
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        // input for the second complex number
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();

        // create c1 object of ComplexNumber with arguments n1 and n2
        ComplexNumber c1 =new ComplexNumber(n1,n2);

        // create c2 object of ComplexNumber with arguments n3 and n4
        ComplexNumber c2 =  new ComplexNumber(n3, n4);

        // add real part of c1 and c2
        double realSum = c1.real + c2.real;

        // add imag part of c1 and c2
        double imagSum = c1.imag + c2.imag;

        // print the output in the format real + imagSumi
        System.out.println(realSum + " + " + imagSum + "i");

    }
}
