import java.util.*;
public class Main {
    public static long solve(ArrayList<Integer> arr) {
        long product = 1;
        for(int i=0; i<arr.size(); i++){
            product = product *  arr.get(i);
        }
        return product;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> A = new ArrayList<>();

        System.out.print("Number of Elements in ArrayList?: ");
        int size = scanner.nextInt();

        for (int i=0; i<size; i++ ){
            A.add(random.nextInt(0, 10));
        }
        System.out.print("\nGenerated ArrayList: \n"+A);
        System.out.print("\nProduct of all the Elements is: "+solve(A));
    }
}