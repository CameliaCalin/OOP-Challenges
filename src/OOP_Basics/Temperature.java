package OOP_Basics;

import java.util.Scanner;

/*Create a program to check if the temperature is IcyHot.*/
class Temperature {
    //field to store temperature
    int hot;
    int cold;

    //constructor to initialize value of hot and cold
    Temperature(int hot , int cold){
        this.hot = hot;
        this.cold = cold;
    }

    //method to check IcyHot temp
    void checkIcyHot(){
        if (hot > 100 && cold < 0){
            System.out.println("IcyHot");
        }
    }
}

class Main6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hot = input.nextInt();
        int cold = input.nextInt();

        //create obj
        Temperature t1 = new Temperature(hot,cold);
        //call checkIcyHot
        t1.checkIcyHot();

        input.close();
    }
}
