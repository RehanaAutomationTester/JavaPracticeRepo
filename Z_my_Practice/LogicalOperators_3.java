package Z_my_Practice;

import java.util.Scanner;

public class LogicalOperators_3 {
    public static void main(String[] args) {
        /*Write a Java program that simulates a simple authentication system.
         Ask the user to enter a username and a password.
         Check if the username is "admin" and the
         password is "password123" using the logical AND operator.
         If both conditions are true, print "Authentication successful";
         otherwise, print "Authentication failed."
         */
        Scanner sc= new Scanner(System.in);

        System.out.println( "Please enter the username");
        String username =sc.nextLine();
        System.out.println( "Please enter the password");
        String password =sc.nextLine();

        //For comparing sc input with username need to use .equals("string") method
        if((username.equals("admin"))&(password.equals("password123"))){
            System.out.println( "Authentication successful");
        }
        else{
            System.out.println( "Authentication failed");
        }



    }
}
