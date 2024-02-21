import java.util.*;
public class Main {
    public static String solve(String A) {
        String NEW = new String();
        for (int i=0; i<A.length();i++){
            NEW+= A.charAt(i);
            NEW+= (int)A.charAt(i)-96;
        }
        return NEW;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String S = scanner.next();
        System.out.println(solve(S));
    }
}