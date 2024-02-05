/*Problem Description
Given two numbers A and B. Print A+B, A*B, A-B, A/B in the same order.*/

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int A = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int B = scanner.nextInt();
        int add = A + B;
        int mul = A * B;
        int sub = A - B;
        int div = A / B;
        System.out.print(add + " " + mul + " " + sub + " " + div );

    }
}