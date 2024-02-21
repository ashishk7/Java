import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int[][] solve(int[][] A, int[][] B) {
        int[][] newMatrix = new int[A.length][B[0].length]; //not using B[0].length will give error out of bound
        for(int row = 0 ; row<A.length ; row++){
            for (int col=0; col<B[0].length; col++){
                newMatrix[row][col]=A[row][col]+B[row][col];
            }
        }
        return newMatrix;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();                   // Creating an instance of the Random class
        System.out.print("Enter rows in Array: ");
        int sizeA = scanner.nextInt();
        System.out.print("Enter columns in Array: ");
        int sizeB = scanner.nextInt();

        int[][] A = new int[sizeA][sizeB];
        int[][] B = new int[sizeA][sizeB];
        int[][] newMatrix = new int[A.length][B[0].length];

        System.out.println("Generated Matrices: ");
        for (int row = 0; row < sizeA; row++) {
            for (int col = 0; col < sizeB; col++) {
                A[row][col] = random.nextInt(10, 100);  //Generating Matrix A using random integers between 10(inclusive) and 100 (exclusive)
                B[row][col] = random.nextInt(10, 100);  //Generating Matrix A using random integers between 10(inclusive) and 100 (exclusive)
            }
        }

        for (int row = 0; row < sizeA; row++) {                      //Printing Matrix A
            for (int col = 0; col < sizeB; col++) {
                System.out.print(A[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int row = 0; row < sizeA; row++) {                      //Printing Matrix B
            for (int col = 0; col < sizeB; col++) {
                System.out.print(B[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("New Matrix after addition of Elements: ");
        newMatrix = solve(A,B);                                     //Calling solve function to add elements of matrices
        for (int row = 0; row < sizeA; row++) {                      //Printing New Matrix after addition of the Elements of two matrices
            for (int col = 0; col < sizeB; col++) {
                System.out.print(newMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}