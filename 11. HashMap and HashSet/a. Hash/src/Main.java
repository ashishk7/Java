import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static HashSet<Integer> convertArraytoHS(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
            for(int i = 0; i<arr.length; i++){
                hs.add(arr[i]);
        }
            return hs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();                   // Creating an instance of the Random class
        int rand = random.nextInt(7, 10);
        int[] arr = new int[rand];
        for (int i = 0; i<rand;i++){
            arr[i] = random.nextInt(1, 10);
        }
        System.out.print("Array: ");
        for (int i = 0; i<rand;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Hashmap: ");
        System.out.print(convertArraytoHS(arr));

    }
}