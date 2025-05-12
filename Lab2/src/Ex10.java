
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opt;
        double a, b;
        String answer;

        do {

            Menu();

            opt = scanner.nextInt();

            switch (opt) {

                case 1:
                    do {
                        System.out.println("=== Addition(+) ===");
                        System.out.print("Please input value A: ");
                        a = scanner.nextDouble();
                        System.out.print("Please input value B: ");
                        b = scanner.nextDouble();
                        System.out.println("Answer of " + a + " + " + b + " = " + Addition(a, b));

                        System.out.println("Do you want to continue? If no go to Menu.");
                        System.out.print("Input your answer (y/n): ");
                        scanner.nextLine();
                        answer = scanner.nextLine();
                    } while (answer.equalsIgnoreCase("y"));
                    break;
                case 2:
                    do {
                        System.out.println("=== Substruction(-) ===");
                        System.out.print("Please input value A: ");
                        a = scanner.nextDouble();
                        System.out.print("Please input value B: ");
                        b = scanner.nextDouble();
                        System.out.println("Answer of " + a + " - " + b + " = " + Substruction(a, b));

                        System.out.println("Do you want to continue? If no go to Menu.");
                        System.out.print("Input your answer (y/n): ");
                        scanner.nextLine();
                        answer = scanner.nextLine();
                    } while (answer.equalsIgnoreCase("y"));
                    break;
                case 3:
                    do {
                        System.out.println("=== Multiplication(x) ===");
                        System.out.print("Please input value A: ");
                        a = scanner.nextDouble();
                        System.out.print("Please input value B: ");
                        b = scanner.nextDouble();
                        System.out.println("Answer of " + a + " x " + b + " = " + Multiplication(a, b));

                        System.out.println("Do you want to continue? If no go to Menu.");
                        System.out.print("Input your answer (y/n): ");
                        scanner.nextLine();
                        answer = scanner.nextLine();
                    } while (answer.equalsIgnoreCase("y"));
                    break;
                case 4:
                    do {
                        System.out.println("=== Division(/) ===");
                        System.out.print("Please input value A: ");
                        a = scanner.nextDouble();
                        System.out.print("Please input value B: ");
                        b = scanner.nextDouble();
                        System.out.println("Answer of " + a + " / " + b + " = " + Division(a, b));

                        System.out.println("Do you want to continue? If no go to Menu.");
                        System.out.print("Input your answer (y/n): ");
                        scanner.nextLine();
                        answer = scanner.nextLine();
                    } while (answer.equalsIgnoreCase("y"));
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("\nPlease choose an option again.");
                    break;
            }

        } while (opt != 5);

        scanner.close();

    }

    public static void Menu() {
        System.out.println("=== Math Menu ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Substruction (-)");
        System.out.println("3. Multiplication (x)");
        System.out.println("4. Division (/)");
        System.out.println("5. Quit");
        System.out.print("\nPlease choose an option: ");
    }

    public static double Addition(double a, double b) {
        return a + b;
    }

    public static double Substruction(double a, double b) {
        return a - b;
    }

    public static double Multiplication(double a, double b) {
        return a * b;
    }

    public static double Division(double a, double b) {
        return a / b;
    }

}
