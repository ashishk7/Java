/*Problem Description
Given two numbers A and B. Concatenate the two numbers and print it.*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int A = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int B = scanner.nextInt();
        System.out.print(A + "" + B);
    }
}