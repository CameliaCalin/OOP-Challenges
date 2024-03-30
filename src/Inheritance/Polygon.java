package Inheritance;
/*Multiple Classes Inherits a Class=> Create a program where two classes inherit from a single class.*/
class Polygon {
    void display(){
        System.out.println("A Polygon is created");
    }
}

//inherit Rectangle and triangle class from Polygon

class Rectangle extends Polygon{

}

class Triangle extends Polygon{

}

class Main1 {
    public static void main(String[] args) {
        //create obj of both rectangle and triangle
        Rectangle rect = new Rectangle();
        Triangle trian = new Triangle();

        //acces the method pf Polygon using react andtrian
        rect.display();
        trian.display();
    }
}
