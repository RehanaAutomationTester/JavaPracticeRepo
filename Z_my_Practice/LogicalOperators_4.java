package Z_my_Practice;

import java.util.Scanner;

public class LogicalOperators_4 {
    public static void main(String[] args) {
        /*
        Develop a Java program that determines if a given year is a leap year.
        A leap year is divisible by 4 but not divisible by 100,
        except for years that are divisible by 400.
        Use logical operators to check these conditions.
         */
        Scanner sc= new Scanner(System.in);

        System.out.println("Plaese enter a year");
        int year=sc.nextInt();
        /*
        year%4=0 && year%!(100)=0 // year%400=0
        for comparing integer needs to use == operator
         */

        if((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println("yes,it is leap year");
        }
        else{
            System.out.println("NO,it is not a leap year");
        }
    }
}
