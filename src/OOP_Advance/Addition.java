package OOP_Advance;

import java.util.Scanner;

/*3. Method Overloading with Parameter Types
Create a program to overload a method with different types of parameters.*/
 class Addition {

     void add ( int number1, int number2) {
         int result = number1 + number2;
         System.out.println(result);
     }

     void add (String first, String second) {
         String result = first + second;
         System.out.println(result);
     }
}

class Main3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a value for number1: ");
        int number1 = input.nextInt();

        System.out.println("Please enter a value for number2: ");
        int number2 = input.nextInt();

        System.out.println("Please enter a value for first String: ");
        String first = input.nextLine();

        System.out.println("Please enter a value for second String: ");
        String second = input.nextLine();

        Addition addition = new Addition();

        addition.add(number1, number2);
        addition.add(first, second);

        input.close();
    }
}
