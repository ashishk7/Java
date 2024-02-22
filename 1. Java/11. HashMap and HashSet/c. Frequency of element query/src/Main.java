import java.util.HashMap;
import java.util.*;
public class Main {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> newList = new ArrayList<>();
        for(int numA : A){
            map.put(numA, map.getOrDefault(numA, 0) + 1);
        }
        System.out.println(map);
        for(int i : B) {
            if(map.get(i)!=null){
                newList.add(map.get(i));
            }
            else newList.add(0);
        }
        System.out.println(newList);
        return newList;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length or Array A: ");
        int sizeA = scanner.nextByte();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        System.out.print("Enter Elements in ArrayList A: ");
        for (int i=0; i<sizeA; i++){
            A.add(scanner.nextInt()) ;
        }
        System.out.print("Enter length or Array B: ");
        int sizeB = scanner.nextByte();
        System.out.print("Enter Elements in ArrayList B: ");
        for (int i=0; i<sizeB; i++){
            B.add(scanner.nextInt()) ;
        }

        System.out.println(A);
        System.out.println(B);
        System.out.print(solve(A,B));

    }
}