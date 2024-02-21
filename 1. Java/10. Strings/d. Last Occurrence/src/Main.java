import java.util.*;
public class Main {
    public static int solve(final String A, final int B) {
        char C = (char)B; //convert ASCII to char
        for(int i =0 ; i<A.length(); i++){
            if(A.charAt(i)==B) {
                return (A.lastIndexOf(C));
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String A = scanner.next();
        System.out.print("Enter ASCII Code (097 to 122): ");
        int B = scanner.nextInt();

        System.out.print(solve(A,B));
    }
}