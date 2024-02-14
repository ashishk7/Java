//Incomplete

import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Total Elements in ArrayList: ");
        int size = scanner.nextInt();
        int newSize=0;
        if (newSize%2==0){newSize=(newSize/2)-1;}
        if (newSize%2!=0){newSize=newSize/2;}

        int[] arr = new int[newSize];
        for(int i=0; i<newSize; i++){
            arr[i]=random.nextInt(0, 100);
            alist.add(arr[i]);
        }
        while(int count==newSize){
            int x = random.nextInt(0, 100);
            for (int i=0; i<arr[].size; i++){
                if(x==arr[i]){

                }
            }
        }

    }
}