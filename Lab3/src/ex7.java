
import java.util.Scanner;

class Students {

    String id;
    String name;
    int age;

    void setValues(Scanner scanner) {

        System.out.print("ID: ");
        id = scanner.nextLine();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();

    }

    void display(int no) {

        System.out.printf("| %-5d | %-10s | %-15s | %-4d |\n", no, id, name, age);

    }

}

public class ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Students[] students = new Students[100];

        int choice;
        int count = 0;

        do {

            System.out.println("====== Menu ======");
            System.out.println("1. Create a student");
            System.out.println("2. List students");
            System.out.println("3. Quit");
            System.out.print("Choose an option:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    if (count < students.length) {
                        students[count] = new Students();
                        System.out.println("Student #" + (count + 1) + ":");
                        students[count].setValues(scanner);
                        System.out.println("\nA student is added to the list!\n");
                        count++;
                    } else {
                        System.out.println("Student list is full!");
                    }

                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("\nNo students to display.\n");
                    } else {
                        System.out.println("===============================================");
                        System.out.printf("| %-5s | %-10s | %-15s | %-4s |\n", "No", "ID", "Name", "Age");
                        System.out.println("===============================================");
                        for (int i = 0; i < count; i++) {
                            students[i].display(i + 1);
                        }
                        System.out.println("===============================================");

                    }
                    break;

                case 3:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid value please try again...");
                    break;

            }

        } while (choice != 3);

        scanner.close();

    }

}
