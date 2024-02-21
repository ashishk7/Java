import java.util.*;
public class Main {
    public static int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("\n"+map);

        int count = 0;
        for (int freq : map.values()) {
            if (freq == 1) {
                count++;
            }
        }
        return count;
    }
    
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