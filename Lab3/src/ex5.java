
import java.util.Scanner;

class Math {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    static double min(double a, double b) {

        if (a > b) {
            return b;
        } else {

            return a;
        }

    }

    static double max(double a, double b) {

        if (a > b) {
            return a;
        } else {

            return b;
        }

    }

}

public class ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x, y;

        System.out.print("Enter a number: ");
        x = scanner.nextDouble();
        System.out.print("Enter other number: ");
        y = scanner.nextDouble();

        System.out.println("\nResult: \n");
        System.out.println(x + " + " + y + " = " + Math.add(x, y));
        System.out.println(x + " - " + y + " = " + Math.subtract(x, y));
        System.out.println(x + " x " + y + " = " + Math.multiply(x, y));
        System.out.println(x + " / " + y + " = " + Math.divide(x, y));
        System.out.println("Min: " + Math.min(x, y));
        System.out.println("Max: " + Math.max(x, y));

        scanner.close();

    }

}
