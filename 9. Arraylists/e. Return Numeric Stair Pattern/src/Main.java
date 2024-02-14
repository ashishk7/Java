import java.util.*;
public class Main {
    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=1; i<=A; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=1; j<=i; j++){
                temp.add(j);
            }
            list.add(temp);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer for Numeric Stair Pattern: ");
        int A = scanner.nextInt();

        System.out.print("\nNumeric Stair Pattern: \n"+solve(A));
    }
}