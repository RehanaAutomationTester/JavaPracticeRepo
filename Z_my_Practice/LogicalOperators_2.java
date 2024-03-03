package Z_my_Practice;

import java.util.Scanner;

public class LogicalOperators_2 {
    public static void main(String[] args) {
        /*Create a Java program that prompts the user to enter two integers.
        Check if both numbers are positive using the logical AND operator.
         If both are positive, print "Both numbers are positive";
        otherwise, print "At least one number is not positive."
         */

        Scanner sc=  new Scanner(System.in);
        System.out.println("Please enter 2 digits");
        int age = sc.nextInt();
        int age1 = sc.nextInt();

        int positive = age & age1;
       if((age>0) && (age1>0)){
           System.out.println("Both numbers are positive");
       }
       else {
           System.out.println("At least one number is not positive.");
       }









    }
}
