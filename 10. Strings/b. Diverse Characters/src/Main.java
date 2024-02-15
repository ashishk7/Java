import java.util.*;
public class Main {
    public static int solve(final String A) {
        int countChar = 0;
        int countInt = 0;
        for(int i=0; i<A.length(); i++){
            if((A.charAt(i)>='A' && A.charAt(i)<='Z') || (A.charAt(i)>='a' && A.charAt(i)<='z')){
                countChar++;
            }
            else{
                countInt++;
            }
        }
        return(countChar>countInt ?  countChar : countInt);
    }
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String Containing Character and Alphabets: ");
        String A = scanner.next();
        System.out.print(solve(A));
    }
}