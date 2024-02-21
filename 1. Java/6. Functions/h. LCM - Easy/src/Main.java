/*
Implement a program that takes two positive integers A and B in the input and prints their LCM.
Definition of LCM : The Least Common Multiple or LCM of two numbers say A and B, is denoted as LCM (A,B). And the LCM is the smallest or least positive integer that is divisible by both A and B.
*/

import java.util.Scanner;
public class Main {
    public static int LCM(final int A, final int B) {
        int HCF=1;                                      //start from 1 because is factor for all numbers. otherwise it will give wrong answer for 2 and 3
        int LCM;
        for(int i = 2; i <= (A < B ? A : B); i++){      //if A == True then i==A else if B== True then i==B
            if ((A % i) == 0 && (B % i) == 0) {
                if (i > HCF) HCF = i;
            }
        }
        LCM=(A*B)/HCF;
        return LCM;                                     //LCM*HCF=A*B
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int A = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int B = scanner.nextInt();
        System.out.print(LCM(A,B));
    }
}