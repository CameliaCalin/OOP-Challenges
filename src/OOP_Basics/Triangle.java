package OOP_Basics;
/*Create a program to find the area of two triangles.*/
 class Triangle {
     //integer fields
    int base;
    int height;

    //constructor of the class
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    //create method to compute area
    void calculateArea(){
        int area = (base * height) /2;
        System.out.println(area);
    }
}

class Main1 {
    public static void main(String[] args) {
        //create the first object t1 of triangle with parmeter 5 and 14
       Triangle t1 = new Triangle(5, 14);
       t1.calculateArea();

        //create second object
        Triangle t2 = new Triangle(12,32);
        t2.calculateArea();
    }
}
