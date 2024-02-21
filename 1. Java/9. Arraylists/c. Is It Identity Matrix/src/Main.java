import java.util.*;
public class Main {
    public static int solve(final List<ArrayList<Integer>> A) {
        for(int i=0; i<A.size(); i++){
            for(int j= 0; j<A.get(0).size(); j++){
                if(i==j){
                    if(A.get(i).get(j)!=1)
                        return 0;
                }
                if(i!=j){
                    if(A.get(i).get(j)!=0){
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.print("Enter Size of NXN Arraylist Matrix: ");
        int size = scanner.nextInt();

        System.out.print("Do you want to generate an Identity Matrix(y/n): ");
        char matrix = scanner.next().charAt(0);

        if(matrix=='y'){
            for(int i=0; i<size; i++){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j= 0; j<size; j++){
                    if(i==j){
                        temp.add(1);
                    }
                    if(i!=j){
                        temp.add(0);
                    }
                }
                list.add(temp);
            }
        }
        if(matrix=='n'){
            for (int i= 0; i<size; i++){                            //Generate a random NxN Arraylist
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<size; j++){
                    temp.add(random.nextInt(0,2));
                }
                list.add(temp);
            }
        }

        System.out.println("\nGenerated Arraylist: \n"+list+"\n");
        System.out.print("Returned Value: \n"+solve(list));
    }
}