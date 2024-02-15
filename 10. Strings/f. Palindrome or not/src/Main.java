import java.util.*;
public class Main {
    //First Method
    public static boolean isPalin(String s) {
        String rS = new String();
        for(int i=(s.length()-1); i>=0 ;i--){
            rS=rS+s.charAt(i);
        }
        System.out.print(rS);
        return (rS.equals(s) ? true:false);
    }
    //Second Method
/*    public static boolean isPalin(String s) {
        int i = 0, j = s.length() - 1;
        while( j > i){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
            i++;
        }
        return true;
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String S = scanner.next();
        System.out.println(isPalin(S));
}
}