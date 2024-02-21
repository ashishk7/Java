/*
Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.
*/
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int A = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int B = scanner.nextInt();
        System.out.print("Enter Number 3: ");
        int C = scanner.nextInt();

        if(A > B && A > C) {
            System.out.print(A);
        } else if(B > A && B > C) {
            System.out.print(B);
        } else {
            System.out.print(C);
        }

    }
}