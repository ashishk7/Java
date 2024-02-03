/*Write a program to input N numbers array, a number X and a number Y from
user and insert an element Y in it at specified position X. X is based on 1-based indexing.*/

import java.util.Scanner;  // Import the Scanner class
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array Length: ");
        int N = scanner.nextInt();  //take input from the user
        int[] arr = new int[N];

        System.out.print("Enter array elements separated by space: ");
        for (int i = 0 ; i<N; i++){
            arr[i]= scanner.nextInt(); //start a for loop to read N values from the user
        }

        System.out.print("Enter insertion position (0 to "+N+"): ");
        int X = scanner.nextInt();  //take input of X position where Y has to be inserted

        System.out.print("Enter Element(number) to be inserted: ");
        int Y = scanner.nextInt();  // take input of new element

        System.out.print("New Array is: ");
        for (int j=0; j<X ; j++){
            System.out.print(arr[j]+ " ");  //print array till X position
        }
        System.out.print(Y+" ");           //print new value
        for (int j=X; j<N ; j++){           //print remaining elements of the array
            System.out.print(arr[j]+ " ");
        }
    }
}