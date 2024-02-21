import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of the Array: ");
        int N = scanner.nextInt();  //take input from the user for length of the array
        int[] A = new int[N];
        int[] newA = new int[N-1];

        System.out.print("Enter Elements of the Array: ");
        for(int j=0 ; j<N ; j++){   //start a loop to input N elements of the array
            A[j]=scanner.nextInt();
        }
        System.out.print("Enter Position to Delete(1 to "+N+"): ");
        int X = scanner.nextInt();  //take input from the user for length of the array

        for(int i = 0; i<X ; i++){
            newA[i] = A[i];
        }
        for(int j = X; j<N ; j++){
            newA[j-1] = A[j];
        }

        for(int k = 0; k<newA.length; k++ ) {
            System.out.print(newA[k]+" ");
        }
    }


}