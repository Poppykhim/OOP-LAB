
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Input a number to check whether it is a prime number: ");
        number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            int divisor = findDivisor(number);
            System.out.println(number + " is not a prime number, because it is divisible by " + divisor + ".");
        }

        scanner.close();

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= java.lang.Math.sqrt((double) n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findDivisor(int n) {
        for (int i = 2; i <= java.lang.Math.sqrt(n); i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return -1; // Should never happen if n is not prime
    }

}
