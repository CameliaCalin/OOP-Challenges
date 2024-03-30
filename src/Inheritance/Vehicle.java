package Inheritance;
/*Override Method of Parent Class => Create a program to override the method of parent class.*/
 class Vehicle {
     //method
    void displayInfo(){
        System.out.println("Four Wheeler or Two Wheeler");
    }
}

class Car extends Vehicle {
     @Override
    void displayInfo(){
         System.out.println("Cars are Four Wheeler");
     }
}

class Main2 {
    public static void main(String[] args) {
        //create object for car
        Car car1 = new Car();

        //call method

        car1.displayInfo();
    }
}
