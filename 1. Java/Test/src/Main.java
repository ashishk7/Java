import java.util.Scanner;  // Import the Scanner class
public class Main {
    public static int solve(int[] A, int B) {
        for(int i=0;i<A.length; i++){
            for(int j=0;j<A.length; j++){
                if(A[i]+A[j]==B){return 1;}
            }
        }
        return 0;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array Length: ");
        int N = scanner.nextInt();  //take input from the user
        int[] arr = new int[N];
        int sum = 0;

        System.out.print("Enter elements separated by space: ");
        for (int i = 0 ; i<N; i++){
            arr[i]= scanner.nextInt();      //start a for loop to take values from the user
        }
        System.out.print(solve(arr, N));
    }
}