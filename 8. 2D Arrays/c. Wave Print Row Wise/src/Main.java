import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter NxN Matrix Length: ");
        int N = scanner.nextInt();
        int[][] A = new int[N][N];

        System.out.print("Enter Elements of the Array: ");
        for(int row=0 ; row<N ; row++){
            for(int col=0; col<N; col++){
                A[row][col]=scanner.nextInt();
            }
        }

        for(int row=0 ; row<N ; row++){
            if(row%2==0){
                for(int col=0; col<N; col++){
                    System.out.print(A[row][col]+" ");
                }
            }
            if(row%2!=0){
                for(int col=N-1; col>=0; col--){
                    System.out.print(A[row][col]+" ");
                }
            }
        }
    }
}