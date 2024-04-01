package Completing_OOP;

import java.util.Scanner;

// College class
class College {
    // static field
    static String name;

    // static method
    static void display() {
        System.out.println(name);
    }
}

// Main class
class Main3 {
    public static void main(String[] args) {
        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the name of the college:");

        // Read input
        String inputName = input.nextLine();

        // Set the static field 'name' using the input
        College.name = inputName;

        // Call the static method 'display' to print the name
        College.display();

        // Close the Scanner object
        input.close();
    }
}
