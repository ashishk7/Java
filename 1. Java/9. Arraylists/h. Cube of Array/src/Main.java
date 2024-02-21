import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static ArrayList<Long> solve(ArrayList<Integer> A) {
        ArrayList<Long> newList = new ArrayList<>();
        long cube = 1;
        for(int i=0; i<A.size(); i++){
            cube = (long)(A.get(i) * A.get(i) * A.get(i));
            newList.add(cube);
        }
        return newList;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> A = new ArrayList<>();

        System.out.print("Number of Elements in ArrayList?: ");
        int size = scanner.nextInt();

        for (int i=0; i<size; i++ ){
            A.add((random.nextInt(0, 10)));
        }
        System.out.print("\nGenerated ArrayList: \n"+A+"\n");
        System.out.print("\nProduct of all the Elements is: \n"+solve(A));
    }
}