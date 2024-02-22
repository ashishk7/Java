import java.util.*;
import static java.lang.Math.sqrt;
public class Main {
    public static int solve(int A) {
        int sum =0;
        if(A==1)return 0;       //we have to specially handle this case
        for(int i = 1; i*i<=A; i++){
           if(A%i==0){
               sum=sum+i+A/i;
           }
        }
        if(sum-A==A)
        return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int A = random.nextInt(1, 100);
        System.out.print("Random Generated Integer: "+A+"\n");
        System.out.print(solve(A));
    }
}