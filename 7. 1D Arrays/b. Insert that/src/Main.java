/*Write a program to input N numbers array, a number X and a number Y from
user and insert an element Y in it at specified position X. X is based on 1-based indexing.*/
//unsolved
import java.util.Scanner;  // Import the Scanner class
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array Length: ");
        int N = scanner.nextInt();  //take input from the user
        int[] arr = new int[N];
        int[] newArr = new int[N+1];

        System.out.print("Enter array elements separated by space: ");
        for (int i = 0 ; i<N; i++){
            arr[i]= scanner.nextInt(); //start a for loop to read N values from the user
        }

        System.out.print("Enter insertion position (0 to "+N+"): ");
        int X = scanner.nextInt();  //take input of X position where Y has to be inserted

        System.out.print("Enter Element(number) to be inserted: ");
        int Y = scanner.nextInt();  // take input of new element

        for (int j=0; j<X ; j++){
            newArr[j]=arr[j];        //add elements of arr to newArr till X
        }

        newArr[X-1] = Y;               //add new element Y to position X

        for (int j=(X); j<newArr.length ; j++){  //add remaining elements starting from X+1 to N+1
            newArr[j]=arr[j-1];
        }

        System.out.print("New Array is: ");    //Print new array
        for(int k = 0 ; k<(N+1); k++){
            System.out.print(newArr[k]+ " ");
        }
    }
}