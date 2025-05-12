
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollar;
        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.print("Please input conversion rate of 1 dollar in Riels: ");
        double exchange_rate = scanner.nextDouble();
        System.out.print("Please input money to exchange in Riels: ");
        double riel = scanner.nextDouble();
        dollar = riel / exchange_rate;
        System.out.println(riel + " RIELS = " + dollar + " USD");
        scanner.close();
    }
}
