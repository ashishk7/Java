/*Q. Categorise the number - Nested if-else
Problem Description
Given the number N, Categorise the number according to following condition :
1. Odd-Positive
2. Odd-Negative
3. Even-Positive
4. Even-Negative

Note : Intention of problem is to teach you Nested If-Else, so try to solve
this problem using nested if-else
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        short N = scanner.nextShort();

        if(N%2==0){System.out.print("Odd");}
        else{System.out.print("Even");}

        if(N>0){System.out.print("-Positive");}
        else{System.out.print("-Negative");}
    }
}