
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vowel = 0;
        int consonant = 0;
        int space = 0;

        System.out.print(
                "Input a sentence: ");
        String txt = scanner.nextLine();

        txt = txt.toLowerCase();

        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);

            if (ch == ' ') {
                space++;
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println(
                "Count of vowel is: " + vowel);
        System.out.println(
                "Count of consonant is: " + consonant);
        System.out.println(
                "Count of space is: " + space);

        scanner.close();

    }
}
