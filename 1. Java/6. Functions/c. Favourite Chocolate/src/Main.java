/*Alex is fond of chocolates. He has initially A rupees and a single chocolate costs B rupees.
But too many chocolates are not good for health, so Alex will not buy more than C chocolates.
Find the number of chocolates Alex will buy with the money he has.*/

import java.util.Scanner;
public class Main {
    public static int sum(int A){
        int sum = 0;
        for (int i = 2; i<=A ; i=i+2){
                sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int A = scanner.nextInt();

        System.out.print("Sum of Even Numbers till "+A+": "+ sum(A));
    }
}