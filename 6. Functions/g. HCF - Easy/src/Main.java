/*
Write a program to input two integers A & B from user and print their HCF.
Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.
*/

import java.util.Scanner;
public class Main {
    public static int count(int A, int B) {
        int ctr = 0;
        for(int i = 2; i<=n; i++){
            int factors = 0;
            for(int j=2; j<=i; j++){
                if(i%j==0) factors = factors + 1;
            }

            if(factors==1) ctr = ctr + 1;
            factors=0;
        }
        return ctr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int A = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int B = scanner.nextInt();
        System.out.print(count(n));
    }
}