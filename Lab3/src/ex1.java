
import java.util.Scanner;

class Equation {

    double a, b, c;

    Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void quadraticEquation() {
        double x1, x2, x;
        double delta = b * b - (4 * a * c);

        if (delta > 0) {
            x1 = (-b + java.lang.Math.sqrt(delta)) / (2 * a);
            x2 = (-b - java.lang.Math.sqrt(delta)) / (2 * a);

            System.out.println("X1 = " + x1 + ", X2 = " + x2);
        } else if (delta == 0) {
            x = (-b) / (2 * a);
            System.out.println("X1 = X2 = " + x);
        } else {
            System.out.println("Equation roots are complex!");
        }
    }
}

public class ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("Program for calculating roots of quadratic equation");
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Input value of a: ");
        a = scanner.nextDouble();
        System.out.print("Input value of b: ");
        b = scanner.nextDouble();
        System.out.print("Input value of c: ");
        c = scanner.nextDouble();

        Equation equation = new Equation(a, b, c);
        equation.quadraticEquation();

        scanner.close();
    }

}
