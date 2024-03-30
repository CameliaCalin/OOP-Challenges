package OOP_Basics;

import java.util.Scanner;

/*Create a program to subtract coordinates.*/
public class Coordinate {
    //fields to store coordinates
    int x;
    int y;

    //constructor to initialize value of x and y
    Coordinate( int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get input for 4 coordinates
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        //create an obj of coordinate with args x1 and y1
        Coordinate c1 = new Coordinate(x1, y1);
        Coordinate c2 = new Coordinate(x2, y2);

        //subtract x coordinates of c1 and c2
        int xDiff = c1.x - c2.x;
        int yDiff = c1.y - c2.y;

        System.out.println(xDiff);
        System.out.println(yDiff);

        input.close();
    }
}
