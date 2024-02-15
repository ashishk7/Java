import java.util.*;
public class Main {
    public static boolean isPalin(String s) {
        for(int i=0; i<(s.length()/2); i++){
            if(s.charAt(i)!=s.charAt(s.length()-i)){
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String S = scanner.next();
        System.out.println(isPalin(S));
        }
}