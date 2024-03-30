package Inheritance;
/*Create a program to implement inheritance.*/
 class Animal {
     //method to print statment
    void eat(){
        System.out.println("I can eat");
    }
}

//inherit a Dog class from Animal
class Dog extends Animal {
     //method inside the Dog


    void dance() {
        System.out.println("Dancing Dog");;
    }
}

class Main {
    public static void main(String[] args) {
        //create obj of the class dog
        Dog obj = new Dog();

        //call the eat()
        obj.eat();

        //call the dance()
        obj.dance();
    }
}
