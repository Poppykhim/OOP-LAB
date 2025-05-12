
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x, y, z;

        System.out.println("Program for calculating equation 1/x = 1/y + 1/z to find value of x");
        System.out.print("Please input y: ");
        y = scanner.nextDouble();
        System.out.print("Please input z: ");
        z = scanner.nextDouble();

        x = 1 / ((1 / y) + (1 / z));

        System.out.println("Result x = " + x);

        scanner.close();

    }

}
