package OOP_Advance;

import java.util.Scanner;

/* 5. Employee Salary using Encapsulation

Create a program to access and modify the salary of an employee using encapsulation.*/
 class Employee {
     private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Main5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();

        Employee obj = new Employee();

        obj.setSalary(salary);

        double result = obj.getSalary();

        input.close();
    }
}
