import java.util.*;
public class Main {
    public static int solve(final List<ArrayList<Integer>> A) {
        int sum = 0;
        for (int i=0; i<A.size(); i++){
            sum = sum + A.get(i).get(i);

        }
        return sum;
    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.print("Enter Size of NXN Arraylist Matrix: ");
        int size = scanner.nextInt();

        for (int i= 0; i<size; i++){                            //Generate a random NxN Arraylist
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<size; j++){
                temp.add(random.nextInt(-10,10));
            }
            list.add(temp);
        }

        System.out.println("\nGenerated Arraylist: \n"+list+"\n");
        System.out.print("Sum of Diagonals: \n"+solve(list));
    }
}