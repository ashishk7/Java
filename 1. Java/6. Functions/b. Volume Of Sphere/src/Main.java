import java.util.Scanner;
public class Main {
    public static int solve(int A) {
        double Volume =  Math.ceil((4*Math.PI * A * A * A) / 3); //volume of sphere is 4/3*pi*r*r*r
        return  (int)Volume;                                     // convert double to int
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius: ");
            int A = scanner.nextInt();                            //take input from the user
            System.out.print("Volume is: " + solve(A));
    }
}