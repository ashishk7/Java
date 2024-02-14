
import java.util.*;
public class Main {
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            int rowSum = 0;
            for(int j=0; j<A.get(i).size(); j++) {
               rowSum = rowSum+ A.get(i).get(j);
            }
           newList.add(rowSum);
        }
        for(int i=0;i<A.get(0).size();i++){
            int colSum = 0;
            for(int j=0; j<A.size(); j++) {
                colSum = colSum+ A.get(j).get(i);
            }
            newList.add(colSum);
        }
        return newList;
    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // Create an ArrayList object
        System.out.print("Enter rows in ArrayList: ");
        int row = scanner.nextInt();
        System.out.print("Enter columns in ArrayList: ");
        int col = scanner.nextInt();

        for(int i = 0; i<row; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<col; j++){
                int r = random.nextInt(1, 10);
                temp.add(r);
            }
            list.add(temp);
        }
        System.out.println("Generated Arraylist: \n"+list+"\n");
        System.out.println("Sum of Rows and Columns: \n"+solve(list));
    }
}