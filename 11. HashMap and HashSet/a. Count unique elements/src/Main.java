import java.util.*;
public class Main {
    public static int solve(ArrayList<Integer> A) {
        HashSet<Integer> Unique = new HashSet<>();
        for (int i = 0; i<A.size(); i++){
            Unique.add(A.get(i));
        }
        for(int j=0; j<Unique.size(); j++){
            freq(A,)
        }
        System.out.print(Unique);
        return 1;
    }
    public static int freq(ArrayList<Integer> A)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length or Array: ");
        int size = scanner.nextByte();
        ArrayList<Integer> A = new ArrayList<>();
        System.out.print("Enter ArrayList Elements separated by Space: ");
        for (int i=0; i<size; i++){
            A.add(scanner.nextInt()) ;
        }
        System.out.print(A);
        System.out.print(solve(A));

    }
}