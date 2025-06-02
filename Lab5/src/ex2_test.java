
import java.util.ArrayList;
import java.util.Scanner;

class Color {

    public static final String RESET = "\u001B[0m";
    public static final String ORANGE = "\u001B[38;5;208m";
}

class Student {

    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%-8d | %-20s | %-5d |", id, name, age);
    }
}

public class ex2_test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> stuArr = new ArrayList<>();
        ArrayList<String> resultMessage = new ArrayList<>();
        stuArr.add(new Student(101, "Alice", 20));
        stuArr.add(new Student(102, "Bob", 21));
        stuArr.add(new Student(103, "Charlie", 19));

        int choice;

        do {

            System.out.println("==== Menu ====");
            System.out.println("1. Add new students");
            System.out.println("2. Delete multiple students");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            int count = 1;
            String answer;
            switch (choice) {
                case 1:

                    do {

                        System.out.println("Student #" + count);
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Age: ");
                        int age = scanner.nextInt();
                        stuArr.add(new Student(id, name, age));
                        count++;

                        scanner.nextLine();
                        System.out.print("Do you want to add more (y/n): ");
                        answer = scanner.nextLine();

                    } while (!answer.equalsIgnoreCase("n"));

                    break;

                case 2:

                    int deleteCount = 1;
                    int no = 1;

                    for (int i = 0; i < 54; i++) {
                        System.out.print("=");
                    }
                    System.out.println();
                    System.out.printf("| %-8s | %-8s | %-20s | %-5s |\n", "No", "ID", "Name", "Age");
                    for (int i = 0; i < 54; i++) {
                        System.out.print("=");
                    }
                    System.out.println();
                    for (Student stu : stuArr) {
                        System.out.printf("| %-8d | %s \n", no++, stu);
                    }
                    for (int i = 0; i < 54; i++) {
                        System.out.print("=");
                    }
                    System.out.println();

                    System.out.println("==== DELETION ====");
                    do {
                        System.out.print("Input student #" + deleteCount + " ID: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine();

                        boolean found = false;

                        for (int i = 0; i < stuArr.size(); i++) {
                            if (stuArr.get(i).id == deleteId) {
                                stuArr.remove(i);
                                resultMessage.add("Student with ID " + deleteId + " deleted!");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            resultMessage.add("Student with ID " + deleteId + " not found!");
                        }

                        deleteCount++;
                        System.out.print("Do you want to delete more (y/n)?: ");
                        answer = scanner.nextLine();

                    } while (!answer.equalsIgnoreCase("n"));

                    System.out.println();
                    for (String rm : resultMessage) {
                        System.out.println(Color.ORANGE + rm + Color.RESET);
                    }
                    resultMessage.clear();
                    System.out.println();

                    break;

                case 3:

                    System.out.println("\nThank you for using our program><");
                    break;

                default:
                    System.out.println("\nInvalid input, please try again...\n");
                    break;
            }

        } while (choice != 3);

        scanner.close();
    }
}
