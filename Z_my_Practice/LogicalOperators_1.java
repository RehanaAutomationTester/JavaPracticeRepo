package Z_my_Practice;
public class LogicalOperators_1 {
    public static void main(String[] args) {
        /*
    Write a Java program that takes two boolean inputs (boolean a and boolean b)
    and prints the result of the logical AND operation between them.
     */
        boolean x= true;
        boolean y=false;
        boolean z;
        boolean r=true;
        z =x && y;
        System.out.println(" z = x && y" + z);// False
        z =y && x;
        System.out.println(" z = y && x" + z);//False
        z=y && z;
        System.out.println(" z = y && z" + z);//False
        z =x && r;
        System.out.println(" z = x && r" + z);// true

    }

}
