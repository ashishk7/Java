/*
You are given a function that takes an integer argument A. Return 1 if A is a perfect square otherwise return 0.
A perfect square is an integer that is the square of an integer. For example 16 is perfect square as it is the square of an integer 4 (42 = 16)
*/

import java.util.Scanner;
public class Main {
    public static int perfectSquare(final int A) {

        for (int i = 0; i <= A; i++){
            while(i*i<A) {
                if (i * i == A)
                    return 1;
                    break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int A = scanner.nextInt();
        System.out.print(perfectSquare(A));
    }
}