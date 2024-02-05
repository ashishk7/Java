/*Problem Description
Take two names A and B as input from the user, print "A says Hi to B" (Without quotations),
where A and B are the names in input.*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name of First Person: ");
        String A = scanner.nextLine();
        System.out.print("Enter Name of Second Person: ");
        String B = scanner.nextLine();

        System.out.print(A + " says Hi to " + B);
    }
}