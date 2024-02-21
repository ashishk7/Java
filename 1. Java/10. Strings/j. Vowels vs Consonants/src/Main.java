import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total cases T: ");
        int T = scanner.nextInt();

        for(int a=0; a<T; a++){
            System.out.print("\nEnter your String: ");
            String S = scanner.next();
            int consonant =0;
            int vowel=0;
            for(int i =0; i<S.length();i++){
                if(S.charAt(i)=='a' || S.charAt(i)=='e' ||S.charAt(i)=='i' ||S.charAt(i)=='o' ||S.charAt(i)=='u'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
            System.out.print(vowel+ " " +consonant+"\n");
        }

    }
}