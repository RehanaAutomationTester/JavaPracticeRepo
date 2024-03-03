package Z_my_Practice;

import java.util.Scanner;

public class LogicalOperators_5 {
    public static void main(String[] args) {
        /*
        Create a Java program that takes an integer input from the user.
        Check if the number is in the range of 10 to 50 (inclusive) or
        outside this range using logical OR operator.
        Print appropriate messages accordingly.
         */
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a number");
        int Num=sc.nextInt();

        if((Num>=10 && Num<=50)||(Num<10 && Num>50)){
            System.out.println("Number lies in between 10-50");
        }
        else {
            System.out.println("Number is not lies in between 10-50");
        }
    }
}
