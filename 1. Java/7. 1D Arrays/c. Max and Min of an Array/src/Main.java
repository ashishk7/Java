/*Take input an array A of size N and write a program to print maximum and minimum elements of the input.
The only line of the input would contain a single integer N that represents the length of the array
followed by the N elements of the input array A.*/

import java.util.Scanner;  // Import the Scanner class
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array Length: ");
        int N = scanner.nextInt();  //take input from the user
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Enter elements separated by space: ");
        for (int i = 0 ; i<N; i++){
            arr[i]= scanner.nextInt();      //start a for loop to take values from the user
        }

        for(int j = 0; j<N;j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
            if (min > arr[j]) {
                min = arr[j];
            }
        }

        System.out.println("Maximum is : " +max);
        System.out.print("Minimum is : " +min);
    }
}