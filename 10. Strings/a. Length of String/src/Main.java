import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Strings you want to Enter?: ");
        int T = scanner.nextInt();

        for (int i = 0; i<T; i++){

            String S = scanner.next();
            System.out.println(S.length());
        }
    }
}