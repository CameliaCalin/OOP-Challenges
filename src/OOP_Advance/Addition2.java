package OOP_Advance;

import java.util.Scanner;

/*4.Method Overloading with Parameter Numbers

Create a program to overload a method with different numbers of parameters. */
 class Addition2 {

     void addNumbers ( int n1, int n2) {
         int result = n1 + n2;
         System.out.println(result);
     }

     void addNumbers ( int n1, int n2, int n3, int n4) {
         int result = n1 + n2 + n3 + n4;
         System.out.println(result);
     }
}

class Main4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();

        Addition2 obj = new Addition2();
        obj.addNumbers(n1, n2);
        obj.addNumbers(n1, n2, n3, n4);

        input.close();
    }
}
