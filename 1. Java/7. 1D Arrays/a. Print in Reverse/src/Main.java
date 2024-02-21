/*Q. Write a program to print the input array A of size N in reverse order where you
have to take integer N and further N elements as input from user.*/

import java.util.Scanner;                   // Import the Scanner class
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array Length: ");
        int N = scanner.nextInt();          //take input from the user
        int[] arr = new int[N];

        for (int i = 0 ; i<N; i++){
            System.out.print("Enter "+ (i+1) + " element: ");
            arr[i]= scanner.nextInt();      //start a for loop to take values from the user
        }

        System.out.print("Reverse of this Array is: ");
        for (int j=N-1; j>=0 ; j--){
            System.out.print(arr[j]+ " ");
        }
    }
}