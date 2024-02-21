/*You are given two integers A and B.
You have to find the value of A^B.
NOTE: The value of answer is always less than or equal to 10^9.*/

import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static int power(int A, int B){
        return (int)Math.pow(A,B);              //The function java.lang.Math.pow() always returns a double datatype
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int A = scanner.nextInt();
        System.out.print("Enter 2nd Number: ");
        int B = scanner.nextInt();
        System.out.println(A+" to the power of "+B+" is: "+ power(A,B));
    }
}