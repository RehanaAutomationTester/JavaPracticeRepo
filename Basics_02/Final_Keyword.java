package Basics_02;

public class Final_Keyword {
    public static void main(String[] args) {
        /*
       when you declare a variable with final keyword
       that cannot be assign with other values
       it throws the following error
       java: cannot assign a value to final variable pi
         */
        final float pi = 3.145f;
        System.out.println(pi);

    //  pi = 10.89f;// Value can't changed in the program
        System.out.println(pi);

        final String STR="TTA";
        final double D1=999.99;
//        D1 = 9.000; //cannot assign a value to final variable D1

    }
}
