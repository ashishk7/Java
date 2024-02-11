import java.util.Scanner;
public class Main {
    public static int[] FrequencyCount(int[] A) {
        int[] freqArray = new int[A.length];
        for(int i = 0 ; i<A.length; i++){
            int count = 0;
            for(int j = 0 ; j<A.length; j++){
                if(A[i]==A[j])count++;
            }
            freqArray[i]=count;
        }
        return freqArray;
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
        int[] newA = FrequencyCount(A);  // save the returned array from the function "FrequencyCount" to a new array "newA"

        for (int k=0;k<N;k++){
            System.out.print(newA[k]+" ");
        }

    }
}