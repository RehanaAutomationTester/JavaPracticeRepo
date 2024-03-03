package Basics_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Even_Odd_ExProgram {
    public static void main(String[] args) {
        /*
        Even & Odd example programs
        condition for Even num: given  num would be divisible by 2 with 0 reminder
        condition for Odd num: given  num would be not divisible by 2 with 0 reminder.
         */
       Scanner sc =new Scanner(System.in);

        System.out.println("please enter a number");
        int num =sc.nextInt();

        if( num%2==0 && !(num==0)){
            System.out.println("It is Even number");
        }
        else if((num%2)!=0){
            System.out.println("It is Odd number");
        }
        else{
            System.out.println("num is zero");
        }


    }
}
