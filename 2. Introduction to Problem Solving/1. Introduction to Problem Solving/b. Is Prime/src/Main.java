import java.util.*;
public class Main {
    public static int solve(int A) {
        int count =0;
        for(int i = 1; i*i<=A; i++){
            if(A%i==0) {
                if (i == A/i) count = count + 1;
                if(i < A/i) count = count + 2;
            }
            if (count>2) return 0;
        }
        if (count == 2) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int A = random.nextInt(0, 100);
        System.out.print("Random Generated Integer: "+A+"\n");

        System.out.print(solve(A));
    }
}