import java.util.*;
public class Main {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
        for (int i = 0; i<A.get(0).size(); i++){
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 0; j<A.size(); j++){
                innerList.add(A.get(j).get(i));
            }
            newList.add(innerList);
        }
        return newList;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        System.out.print("GENERATE ARRAYLIST\n"+"Enter Rows and Columns Separated by Space: ");
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        //generating an Arraylist Matrix
        for(int i = 0 ; i<r ; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j<c ; j++){
                temp.add(random.nextInt(0, 100));
            }
            A.add(temp);
        }

        //Printing Generated Arraylist
        System.out.println("\nGenerated Arraylist: \n"+A+"\n");
        System.out.println("Transposed Matrix: \n"+solve(A));

    }
}