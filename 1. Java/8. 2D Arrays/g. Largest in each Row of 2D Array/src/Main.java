import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int[] solve(int[][] A) {
        int[] largestInRow = new int[A.length];
        for(int i =0; i<A.length; i++){
            int largest = 0;
            for(int j=0; j<A[0].length; j++){
                if(largest<A[i][j])largest=A[i][j];
            }
            largestInRow[i]=largest;
        }
        return largestInRow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();                   // Creating an instance of the Random class
        System.out.print("Enter rows in Array: ");
        int sizeA = scanner.nextInt();
        System.out.print("Enter columns in Array: ");
        int sizeB = scanner.nextInt();

        int[][] A = new int[sizeA][sizeB];
        int[] largestInRow = new int[sizeA];

        System.out.println("Generated Matrix: ");
        for (int row = 0; row < sizeA; row++) {
            for (int col = 0; col < sizeB; col++) {
                A[row][col] = random.nextInt(1, 10);  //Generating Matrix A using random integers between 10(inclusive) and 100 (exclusive)
                System.out.print(A[row][col] + " ");
            }
            System.out.println();
        }
        largestInRow = solve(A);
        System.out.println("\n"+"Largest element in each Row: ");
        for(int i=0; i<sizeA; i++){
            System.out.print(largestInRow[i]+" ");
        }

    }
}