import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of the Array: ");
        int N = scanner.nextInt();  //take input from the user for length of the array
        int[] A = new int[N];
        int[] newA = new int[N-1];

        System.out.print("Enter Elements of the Array: ");
        for(int i=0 ; i<N ; i++){   //start a loop to input N elements of the array
            A[i]=scanner.nextInt();
        }

        for(int j = 0; j<A.length; j++){
            if(A[j]<0)System.out.print(A[j]+" ");
        }
    }
}