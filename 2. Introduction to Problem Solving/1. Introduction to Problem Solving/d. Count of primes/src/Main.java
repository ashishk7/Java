import java.util.*;
import static java.lang.Math.sqrt;
public class Main {
    public static int solve(int A) {
        boolean checkPrime = false;
        int countPrime = 0;
        for(int i = 0; i<=A; i++){
            if(isPrime(i)==true) countPrime++;
        }
        return countPrime;
    }
    public static boolean isPrime(int N){
        int count = 0;
        for(int i = 1; i*i<=N; i++){
            if(N%i==0){
                if (i == N / i) count = count + 1;
                else count = count + 2;
            }
            if(count>2) {return false;}
        }
        if(count==2) {return true;}
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int A = random.nextInt(19, 20);
        System.out.print("Random Generated Integer: "+A+"\n");
        System.out.print(solve(A));
    }
}