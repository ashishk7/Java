import java.util.*;
public class Main {
    public static int solve(String A) {
        int a=0, p=0, m=0;
        for (int i=0; i<A.length();i++){
            if(A.charAt(i)=='a')a+=1;
            if(A.charAt(i)=='p')p+=1;
            if(A.charAt(i)=='m')m+=1;
        }
        return (a+p==m ? 1:0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String S = scanner.next();
        System.out.println(solve(S));
    }
}