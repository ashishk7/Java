import java.util.*;
public class Main {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> multiplesList = new ArrayList<>();

        for(int i=0; i<B.size(); i++){
                multiplesList.add(findMultiples(A, B.get(i)));
            }
        return multiplesList;
    }
    public static ArrayList<Integer> findMultiples(ArrayList<Integer> A, int B) {
        ArrayList<Integer> multiplesList = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            if(A.get(i)%B==0){
                multiplesList.add(A.get(i));
            }
        }
        return multiplesList;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        System.out.print("Number of Elements in ArrayList A?: ");
        int sizeA = scanner.nextInt();
        System.out.print("Number of Elements in ArrayList B?: ");
        int sizeB = scanner.nextInt();


        for (int i=0; i<sizeA; i++ ){
            A.add(random.nextInt(0, 50));
        }
        for (int i=0; i<sizeB; i++ ){
            B.add(random.nextInt(0, 10));
        }
        System.out.print("\nGenerated ArrayList A: \n"+A+"\n");
        System.out.print("\nGenerated ArrayList B: \n"+B+"\n");

        System.out.print("\nNew Matrix with Multiples: \n"+solve(A,B)+"\n");
    }
}