import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int solve(int[][] A, int[][] B) {
        for(int row = 0 ; row<A.length ; row++){
            for (int col=0; col<B[0].length; col++){
                if(A[row][col]!=B[row][col]){
                    return 0;
                }
            }
        }
        return 1;
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
        System.out.print("Generate Equal Matrices?(y/n): ");
        char ans = scanner.next().charAt(0);

        System.out.println("Generated Matrices: ");
        for (int row = 0; row < sizeA; row++) {
            for (int col = 0; col < sizeB; col++) {
                A[row][col] = random.nextInt(1, 10);
                if(ans=='n'){
                    B[row][col] = random.nextInt(1, 10);
                }
                else{B[row][col]=A[row][col];}
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
        System.out.println("\n"+solve(A,B));
    }
}