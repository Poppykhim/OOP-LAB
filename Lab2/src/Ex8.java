
import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] value = new int[5];

        System.out.print("Input value of A: ");
        value[0] = scanner.nextInt();
        System.out.print("Input value of B: ");
        value[1] = scanner.nextInt();
        System.out.print("Input value of C: ");
        value[2] = scanner.nextInt();
        System.out.print("Input value of D: ");
        value[3] = scanner.nextInt();
        System.out.print("Input value of E: ");
        value[4] = scanner.nextInt();

        int min = value[0];

        for (int i = 0; i < 5; i++) {
            if (value[i] <= min) {
                min = value[i];
            }
        }

        System.out.println("The smallest number among A, B, C, D, and E is: " + min);

        scanner.close();

    }
}
