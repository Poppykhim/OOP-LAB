
import java.util.Scanner;

class Process {

    int num;
    int value[];

    Process(int num, int value[]) {
        this.num = num;
        this.value = value;
    }

    int findMin() {
        int min = value[0];
        for (int i = 1; i < num; i++) {
            if (value[i] < min) {
                min = value[i];
            }
        }
        return min;

    }

    int findMax() {
        int max = value[0];
        for (int i = 1; i < num; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }
        return max;
    }

    int findSum() {
        int Sum = value[0];
        for (int i = 1; i < num; i++) {
            Sum += value[i];
        }
        return Sum;
    }

    int findAvg() {
        return findSum() / num;
    }

}

public class ex2 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many number to be input? ");
            System.out.println("Number of input: ");
            int num = sc.nextInt();
            int value[] = new int[num];

            for (int i = 0; i < num; i++) {
                System.out.print("Value #" + (i + 1) + ": ");
                value[i] = sc.nextInt();
            }
            Process p = new Process(num, value);
            System.out.println("Min: " + p.findMin());
            System.out.println("Max: " + p.findMax());
            System.out.println("Average: " + p.findAvg());
            System.out.println("Sum: " + p.findSum());
        }
    }
}
