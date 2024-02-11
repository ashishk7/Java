import java.util.Scanner;
public class Main {
    public static int CheckIfSorted(int[] arr) {

        for(int i = 1 ; i<arr.length; i++){
            if(!(arr[i]>=arr[i-1])) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of the Array: ");
        int N = scanner.nextInt();  //take input from the user for length of the array
        int[] arr = new int[N];

        System.out.print("Enter Elements of the Array: ");
        for(int j=0 ; j<N ; j++){   //start a loop to input N elements of the array
            arr[j]=scanner.nextInt();
        }

        System.out.println(CheckIfSorted(arr));


    }
}