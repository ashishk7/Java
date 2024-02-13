import java.util.*;
public class Main {
    public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)%5==0 && arr.get(i)%7==0){
                newList.add(arr.get(i));
            }
        }
        return newList;
    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(); // Create an ArrayList object
        System.out.print("Enter size of ArrayList: ");
        int size = scanner.nextInt();
        for(int i = 0; i<size; i++){
            list.add(random.nextInt(1, 100));
        }
        System.out.println("Generated Arraylist: \n"+list+"\n");

        System.out.println("ArrayList of Elements Divisible by 5 and 7: \n"+solve(list));
    }
}