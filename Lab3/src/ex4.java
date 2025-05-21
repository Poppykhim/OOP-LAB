
import java.util.Scanner;

class Student {

    String id;
    String name;
    int age;

    Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}

public class ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student[] student = new Student[100];

        String id, name;
        int age;
        String answer;
        int count = 0;

        for (int i = 0; i < student.length; i++) {
            System.out.println("Student #" + (i + 1) + ":");
            System.out.print("ID: ");
            id = scanner.nextLine();
            System.out.print("Name: ");
            name = scanner.nextLine();
            System.out.print("Age: ");
            age = scanner.nextInt();

            student[i] = new Student(id, name, age);
            count++;

            scanner.nextLine();
            System.out.print("Do you want to add more (y/n)?: ");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("n")) {
                break;
            }

        }

        System.out.println("===============================================");
        System.out.printf("| %-5s | %-10s | %-15s | %-4s |\n", "No", "ID", "Name", "Age");
        System.out.println("===============================================");

        for (int j = 0; j < count; j++) {
            System.out.printf("| %-5d | %-10s | %-15s | %-4d |\n", (j + 1), student[j].id, student[j].name,
                    student[j].age);
        }

        System.out.println("===============================================");

        scanner.close();

    }

}
