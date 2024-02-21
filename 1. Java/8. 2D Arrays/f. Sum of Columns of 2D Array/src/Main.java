import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int[] solve(int A, int B, int[][] C) {
        int[] columnSum = new int[B];
        for(int i =0; i<B; i++){
            int sum = 0;
            for(int j=0; j<A; j++){
                sum=sum+C[j][i];
            }
            columnSum[i]=sum;
        }
        return columnSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();                   // Creating an instance of the Random class
        System.out.print("Enter rows in Array: ");
        int A = scanner.nextInt();
        System.out.print("Enter columns in Array: ");
        int B = scanner.nextInt();

        int[][] C = new int[A][B];
        int[] columnSum = new int[B];

        System.out.println("Generated Matrix: ");
        for (int row = 0; row < A; row++) {
            for (int col = 0; col < B; col++) {
                C[row][col] = random.nextInt(1, 5);  //Generating Matrix A using random integers between 10(inclusive) and 100 (exclusive)
                System.out.print(C[row][col] + " ");
            }
            System.out.println();
        }
        columnSum = solve(A,B,C);
        System.out.println("\n"+"Sum of Columns: ");
        for(int i=0; i<B; i++){
            System.out.print(columnSum[i]+" ");
        }

    }
}