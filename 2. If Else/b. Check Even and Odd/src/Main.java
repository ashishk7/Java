/*
Q. Check even/odd
Problem Description
Write a program to input an integer from user and print 1 if it is odd otherwise print 0.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int N = scanner.nextInt();

        if(N%2==0){System.out.print(1);}
        else{System.out.print(0);}
    }
}