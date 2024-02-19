import java.util.*;
public class Main {
/*    public static int solve(ArrayList<Integer> A) {
        int count=0;
        HashSet<Integer> Unique = new HashSet<>();
        for (int i = 0; i<A.size(); i++){
            Unique.add(A.get(i));
        }
        System.out.print("\n"+Unique+"\n");
        for(int element: Unique){
            int f = freq(element, A);
            if(f==1){
                count++;
            }
        }

        return count;
    }
    public static int freq(int I, ArrayList<Integer> A){
        int f=0;
        for(int i=0; i<A.size();i++){
            if(A.get(i)==I){
                f++;
            }
        }
        return f;
    }*/

    public static int solve(ArrayList<Integer> A) {
    HashMap<Integer, Integer> Unique = new HashMap<>();
        for (int i=0; i<A.size();i++){
            if(Unique.containsKey(A.get(i))){
                Unique.put()
            }
        }
        return 1;
    }
    public static int freq(int I, ArrayList<Integer> A) {
        HashMap<Integer, Integer> Unique = new HashMap<>();
        for (int i=0; i<A.size();i++){
            Unique.put(A.get(i), freq(A.get(i)))
        }
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