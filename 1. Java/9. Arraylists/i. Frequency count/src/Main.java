import java.util.*;
public class Main {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> freqList = new ArrayList<>();
        int freqCount = 0;
        for(int i=0; i<A.size(); i++){
            freqCount= freqOf(A,A.get(i));
            freqList.add(freqCount);
            freqCount=0;
        }
        return freqList;
    }
    public static int freqOf(ArrayList<Integer> A, int freqCount){
        int count = 0;
        for(int i=0; i<A.size(); i++){
            if(freqCount==A.get(i)){
                count++;
            }
        }
        return count;
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
        System.out.print("\nGenerated ArrayList: \n"+A+"\n");
        System.out.print("\nNew ArrayList with Frequency count is: \n"+solve(A)+"\n");
    }
}