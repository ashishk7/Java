import java.util.*;
public class Main {
    public static String solve(String A) {
        StringBuilder newString = new StringBuilder();
        for (int i=0; i<A.length();i++){
            int asciiValue = (int)A.charAt(i)+32;
            newString.append((char) asciiValue);
        }
        return newString.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string in lower case: ");
        String S = scanner.next();
        System.out.println(solve(S));
    }
}