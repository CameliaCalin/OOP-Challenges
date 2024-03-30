package Inheritance;
/*Override Method in Multiple Classes =>Create a program to override the same method in multiple classes.*/
class Animal1 {
    void display(){
        System.out.println("I am an animal");
    }
}

class Dog1 extends Animal1 {
    //override
    @Override
    void display(){
        System.out.println("I am a dog");
    }
}

class Cat1 extends Animal1 {
    @Override
    void display() {
        System.out.println("I am a cat");
    }
}

class Main4 {
    public static void main(String[] args) {
        //create objctes of dog1 and cat1
        Dog1 dog1 = new Dog1();
        Cat1 cat1 = new Cat1();

        //call method
        dog1.display();
        cat1.display();
    }
}
