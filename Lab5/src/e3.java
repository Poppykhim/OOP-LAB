
import java.util.ArrayList;
import java.util.Scanner;

class Shape {

    public void display() {
        System.out.println("Generic Shape");
    }
}

class Line extends Shape {

    int length;

    public Line(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("_");
        }
        return sb.toString();
    }
}

class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Width: " + width + ", Height: " + height + "\n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

class Triangle extends Shape {

    int height;

    public Triangle(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Height: " + height + "\n");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class e3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Line> lines = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        ArrayList<Triangle> triangles = new ArrayList<>();

        int option;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. View all lines");
            System.out.println("2. View all rectangles");
            System.out.println("3. View all triangles");
            System.out.println("4. Add a new shape");
            System.out.println("5. Quit");
            System.out.print("Choose an Option: ");
            option = scanner.nextInt();

            int shapeOption;

            switch (option) {

                case 1:

                    int lineCount = 1;

                    System.out.println("\n==== List all lines ====");
                    for (Line line : lines) {
                        System.out.println((lineCount++) + ". length: " + line.length);
                        System.out.println(line);
                    }
                    break;

                case 2:

                    int rectangleCount = 1;

                    System.out.println("\n==== List all Rectangles ====");
                    for (Rectangle rectangle : rectangles) {
                        System.out.print((rectangleCount++) + ". ");
                        System.out.println(rectangle);
                    }
                    break;

                case 3:

                    int triangleCount = 1;

                    System.out.println("\n==== List all Triangles ====");
                    for (Triangle triangle : triangles) {
                        System.out.print((triangleCount++) + ". ");
                        System.out.println(triangle);
                    }
                    break;

                case 4:
                    System.out.println("==== Add new shape ====");
                    System.out.println("Select a shape:");
                    System.out.println("1. Line");
                    System.out.println("2. Rectangle");
                    System.out.println("3. Triangle");
                    System.out.print("Choose an Option: ");
                    shapeOption = scanner.nextInt();

                    switch (shapeOption) {
                        case 1:
                            System.out.print("Input length: ");
                            int length = scanner.nextInt();
                            lines.add(new Line(length));
                            break;

                        case 2:
                            System.out.print("Input width: ");
                            int width = scanner.nextInt();
                            System.out.print("Input height: ");
                            int height = scanner.nextInt();
                            rectangles.add(new Rectangle(width, height));
                            break;

                        case 3:
                            System.out.print("Input hight: ");
                            int heightForT = scanner.nextInt();
                            triangles.add(new Triangle(heightForT));
                            break;

                        default:
                            System.out.println("Invalid input, please try again...");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using our program><");
                    break;

                default:
                    System.out.println("Invalid input, please try again...");
                    break;
            }

        } while (option != 5);

        scanner.close();
    }
}
