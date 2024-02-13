





// INCOMPLETE
import java.util.*;
public class Main {
//    public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
//        ArrayList<Integer> newList = new ArrayList<Integer>();
//        for(int i=0;i<arr.size();i++){
//            if(arr.get(i)%5==0 && arr.get(i)%7==0){
//                newList.add(arr.get(i));
//            }
//        }
//        return newList;
//    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

//        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(); // Create an ArrayList object
        System.out.print("Enter rows in ArrayList: ");
        int row = scanner.nextInt();
        System.out.print("Enter columns in ArrayList: ");
        int col = scanner.nextInt();
        ArrayList<Integer>[][] list = new ArrayList[row][col];
        for(int i = 0; i<row; i++){
            for(int j=0; j<col; j++){
                list[i][j] = new ArrayList<Integer>();
                list[i][j].add(random.nextInt(1, 100));
            }
        }
        System.out.println("Generated Arraylist: \n"+Arrays.deepToString(list)+"\n");

    }
}