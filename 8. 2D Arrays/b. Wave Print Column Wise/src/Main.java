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

        for(int col=0 ; col<N ; col++){
            if(col%2==0){
                for(int row=0; row<N; row++){
                    System.out.print(A[row][col]+" ");
            }

            }
            if(col%2!=0){
                for(int row=N-1; row>=0; row--){
                    System.out.print(A[row][col]+" ");
            }

            }
        }
    }
}