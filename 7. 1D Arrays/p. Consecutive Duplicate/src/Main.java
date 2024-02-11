import java.util.Scanner;
public class Main {
    public static boolean pairCount(int[] A) {
        for(int i = 0 ; i<A.length-1; i++){
            if (A[i] == A[i+1])return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of the Array: ");
        int N = scanner.nextInt();  //take input from the user for length of the array
        int[] A = new int[N];

        System.out.print("Enter Elements of the Array: ");
        for(int j=0 ; j<N ; j++){   //start a loop to input N elements of the array
            A[j]=scanner.nextInt();
        }

        System.out.print(pairCount(A));

    }
}