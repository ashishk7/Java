import java.util.Scanner;
public class Main {
    public static int pairCount(int[] A, int B) {
        int count = 0;
        for(int i = 0 ; i<A.length; i++){
            for(int j = i+1 ; j<A.length; j++) {
                if (A[i] + A[j] == B) count++;
            }
        }
        return count;
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

        System.out.print("Enter sum of the pairs: ");
        int B = scanner.nextInt();  //take input from the user for length of the array

        System.out.print(pairCount(A,B));

    }
}