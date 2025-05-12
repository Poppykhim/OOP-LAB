
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        String answer;
        int max;
        int count = 0;

        do {

            System.out.print("Input value in Array at index " + count + ": ");
            arr[count] = scanner.nextInt();
            count++;

            if (count >= arr.length) {
                System.out.println("\nArray is full. Cannot add more values.");
                break;
            }

            scanner.nextLine();
            System.out.print("Do you want to add more(y/n)?: ");
            answer = scanner.nextLine();

        } while (answer.equalsIgnoreCase("y"));

        max = arr[0];

        for (int i : arr) {
            if (i >= max) {
                max = i;
            }
        }

        System.out.println("\nThe biggest number among in Array is: " + max);

        scanner.close();

    }

}
