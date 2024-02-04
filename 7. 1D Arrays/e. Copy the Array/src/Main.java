/*
You are given a constant array A and an integer B.
You are required to return another array where outArr[i] = A[i] + B.*/


import java.util.Scanner;  // Import the Scanner class
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array Length: ");
        int N = scanner.nextInt();  //take input from the user
        int[] arr = new int[N];
        int sum = 0;

        System.out.print("Enter elements separated by space: ");
        for (int i = 0 ; i<N; i++){
            arr[i]= scanner.nextInt();      //start a for loop to take values from the user
        }

        for (int i = 0 ; i<N; i++){
            sum = sum+arr[i];
        }
        System.out.print("Sum of Elements of this array is: "+sum);
    }
}