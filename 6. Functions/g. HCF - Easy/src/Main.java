/*
Write a program to input two integers A & B from user and print their HCF.
Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.
*/

import java.util.Scanner;
public class Main {
    public static int HCF(int A, int B) {
     int HCF = 1;
     int last =0;

//     for(int i = 2; i <= (A < B ? A : B); i++){      //other way to check the smallest number and assign its value to i
         if (A<B)last=A;                               //comment from here for alternative
         if (A>B)last=B;
         for (int i=2; i<=last;i++) {                   //comment till here for alternative
         if ((A % i) == 0 && (B % i) == 0) {
             if (i > HCF) HCF = i;
         }
     }
     return HCF;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int A = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int B = scanner.nextInt();
        System.out.print(HCF(A,B));
    }
}