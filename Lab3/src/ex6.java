
import java.util.Scanner;

class MyMath2 {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static double rectangleSurface(double width, double height) {
        return width * height;
    }

    static double circleSurface(double radius) {
        return 3.14 * radius * radius;
    }

    static int max(int a, int b, int c, int d, int e) {

        if (a > b && a > c && a > d && a > e) {
            return a;
        } else if (b > a && b > c && b > d && b > e) {
            return b;
        } else if (c > a && c > b && c > d && c > e) {
            return c;
        } else if (d > a && d > b && d > c && d > e) {
            return d;
        } else {
            return e;
        }

    }

    static int min(int a, int b, int c, int d, int e) {

        if (a < b && a < c && a < d && a < e) {
            return a;
        } else if (b < a && b < c && b < d && b < e) {
            return b;
        } else if (c < a && c < b && c < d && c < e) {
            return c;
        } else if (d < a && d < b && d < c && d < e) {
            return d;
        } else {
            return e;
        }

    }

}

public class ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        double width, height;
        double radius;
        int a, b, c, d, e;

        System.out.print("Enter a number to define its Factorial: ");
        n = scanner.nextInt();

        System.out.println(n + "! = " + MyMath2.factorial(n));

        System.out.println("\n\t=== Define Rectangle Surface ===");
        System.out.print("Enter a Width: ");
        width = scanner.nextDouble();
        System.out.print("Enter a Height: ");
        height = scanner.nextDouble();

        System.out.println("Surface of Rectangle = " + MyMath2.rectangleSurface(width, height) + " m^2");

        System.out.println("\n\t=== Define Circle Surface ===");
        System.out.print("Enter a Radius: ");
        radius = scanner.nextDouble();

        System.out.println("Surface of Circle = " + MyMath2.circleSurface(radius) + " m^2");

        System.out.println("\n\t=== Define Max and Min value ===");
        System.out.print("Enter a value of a: ");
        a = scanner.nextInt();
        System.out.print("Enter a value of b: ");
        b = scanner.nextInt();
        System.out.print("Enter a value of c: ");
        c = scanner.nextInt();
        System.out.print("Enter a value of d: ");
        d = scanner.nextInt();
        System.out.print("Enter a value of e: ");
        e = scanner.nextInt();

        System.out.println("Max: " + MyMath2.max(a, b, c, d, e));

        System.out.println("Min: " + MyMath2.min(a, b, c, d, e));

        scanner.close();

    }

}
