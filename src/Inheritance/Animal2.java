package Inheritance;
/*Access Overridden Method Superclass

Create a program to Access the overridden method of the Parent Class.*/
class Animal2 {
    void display(){
        System.out.println("I am an animal");
    }
}

class Dog2 extends Animal2 {
    //override the dispaly method
    @Override
    void display(){
        // call display() pf supercalss using the super kwyword
        super.display();
        System.out.println("I am a dog");
    }
}

class Main5 {
    public static void main(String[] args) {
        //create obj
        Dog2 dog1 = new Dog2();
        dog1.display();
    }
}