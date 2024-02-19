// Import the HashMap class
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        String S= capitalCities.put("England", "London");
        System.out.println(S);
        String A=capitalCities.put("Germany", "Berlin");
        System.out.println(A);
        String B=capitalCities.put("Norway", "Oslo");
        System.out.println(B);
        String M=capitalCities.put("USA", "Washington DC");
        System.out.println(M);

    }
}