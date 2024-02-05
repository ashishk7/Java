/*You will be given an integer n. You need to return the count of prime numbers less than or equal to n.*/

import java.util.Scanner;
public class Main {
    public static int count(int n) {
        int ctr = 0;
        for(int i = 2; i<=n; i++){
            int factors = 0;
            for(int j=2; j<=i; j++){
                if(i%j==0) factors = factors + 1;
            }

            if(factors==1) ctr = ctr + 1;
            factors=0;
        }
        return ctr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        System.out.print(count(n));
    }
}