/*
Q. Which Month?
Problem Description

Write a program to input an integer(A) from user and print the Ath month of the year.
Months list: {January, February, March, April, May, June, July, August, September, October, November, December}
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value between 1 to 12: ");
        int A = scanner.nextInt();
        if(A==1){System.out.println("January");}
        if(A==2){System.out.println("February");}
        if(A==3){System.out.println("March");}
        if(A==4){System.out.println("April");}
        if(A==5){System.out.println("May");}
        if(A==6){System.out.println("June");}
        if(A==7){System.out.println("July");}
        if(A==8){System.out.println("August");}
        if(A==9){System.out.println("September");}
        if(A==10){System.out.println("October");}
        if(A==11){System.out.println("November");}
        if(A==12){System.out.println("December");}
        else if (A>12 || A<1){
            System.out.print("Invalid Number");
        }
    }
}