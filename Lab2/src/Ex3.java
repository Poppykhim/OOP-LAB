
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] answer = new String[8];

        System.out.println("==== Covid-19 Screen Health ===");
        System.out.println("Q1. Feeling feverish and/or having chills?");
        System.out.print("Answer: ");
        answer[0] = scanner.nextLine();
        System.out.println(
                "Q2. Has there been any use of fever reducing medication within the last 24 hours not due to another health\r\n"
                + "condition?");
        System.out.print("Answer: ");
        answer[1] = scanner.nextLine();
        System.out.println("Q3. A new cough that is not due to another health condition?");
        System.out.print("Answer: ");
        answer[2] = scanner.nextLine();
        System.out.println("Q4. New chills that are not due to another health condition?");
        System.out.print("Answer: ");
        answer[3] = scanner.nextLine();
        System.out.println("Q5. A new sore throat that is not due to another health condition?");
        System.out.print("Answer: ");
        answer[4] = scanner.nextLine();
        System.out.println("Q6. A new loss of taste or smell?");
        System.out.print("Answer: ");
        answer[5] = scanner.nextLine();
        System.out.println("Q7. Have you had a positive test for the virus that causes COVID-19\r\n"
                + "disease within the past 10 days?");
        System.out.print("Answer: ");
        answer[6] = scanner.nextLine();
        System.out.println(
                "Q8. In the past 14 days, have you had close contact (within about 6 feet for 15 minutes or more) with someone with\r\n"
                + "suspected or confirmed COVID-19?");
        System.out.print("Answer: ");
        answer[7] = scanner.nextLine();

        System.out.println("=================================================");
        System.out.println("| Questions           | Answers                 |");
        System.out.println("=================================================");

        for (int i = 0; i < 8; i++) {
            if (answer[i].equalsIgnoreCase("yes")) {
                System.out.printf("| Q %-17d | %-23s |\n", i + 1, answer[i]);
                System.out.println("-------------------------------------------------");
            } else if (answer[i].equalsIgnoreCase("no")) {
                System.out.printf("| Q %-17d | %-23s |\n", i + 1, answer[i]);
                System.out.println("-------------------------------------------------");
            } else {
                System.out.printf("| Q %-17d | %-23s |\n", i + 1, "Invalid");
                System.out.println("-------------------------------------------------");
            }
        }

        scanner.close();
    }

}
