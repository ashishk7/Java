import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int[] solve(int A, int B, int[][] C) {
    int[] columnSumMatrix = new int[C[0].length];
        for (int col = 0; col<C[0].length; col++) {
            for (int row = 0; row < C.length; row++) {
                columnSumMatrix[col] = C[row][col];
            }
        }
        return columnSumMatrix;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();                   // Creating an instance of the Random class
        System.out.print("Enter rows in Array: ");
        int A = scanner.nextInt();
        System.out.print("Enter columns in Array: ");
        int B = scanner.nextInt();

        int[][] C = new int[A][B];
        int[] sumOfColumns = new int[B];
        //Generate and print Matrix
        System.out.println("Generated Matrices: ");
        for (int row = 0; row < A; row++) {
            for (int col = 0; col < B; col++) {
                C[row][col] = random.nextInt(10, 100);  //Generating Matrix C using random integers between 10(inclusive) and 100 (exclusive)
                System.out.print(C[row][col] + " ");                 //Print elements of the matrix as generated
            }
            System.out.println();
        }

        sumOfColumns = solve(A,B,C);

        for(int i = 0; i<B; i++){
            System.out.print(sumOfColumns[i]+" ");
        }

    }
}