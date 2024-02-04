import java.util.Scanner;
public class Main {
    public static double solve(int A) {
        return  Math.round((Math.PI * A * A) * 100.0) / 100.0; //multiply by 100 and divide by 100 to constrain the output to 2 decimal points
    }                                                          //Math.round rounds off a number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int A = scanner.nextInt();                             //take input from the user
        System.out.print(solve(A));
    }
}