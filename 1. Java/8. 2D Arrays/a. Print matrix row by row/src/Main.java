import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows in Array: ");
        int N = scanner.nextInt();
        System.out.print("Enter columns in Array: ");
        int M = scanner.nextInt();
        int[][] A = new int[N][M];

        System.out.print("Enter Elements of the Array: ");
        for(int row=0 ; row<N ; row++){
            for(int col=0; col<M; col++){
                A[row][col]=scanner.nextInt();
            }
        }

        for(int row=0 ; row<N ; row++){
            for(int col=0; col<M; col++){
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
    }
}