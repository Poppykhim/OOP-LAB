
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputSecond;

        System.out.print("Input number of seconds: ");
        inputSecond = scanner.nextInt();

        int hours = inputSecond / 3600;
        int minutes = (inputSecond % 3600) / 60;
        int second = inputSecond % 60;

        System.out.printf("Time corresponding to %d seconds is: %02d:%02d:%02d", inputSecond, hours, minutes, second);

        scanner.close();

    }

}
