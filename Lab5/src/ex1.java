
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class MyDate {

    public void getCurrentDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = new Date();
        String formatted = format.format(d);
        System.out.println(formatted);
    }

    public long calculateDaysBtwDates(String date1, String date2) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = format.parse(date1);
        Date d2 = format.parse(date2);
        long diff = Math.abs(d2.getTime() - d1.getTime());
        return diff / (1000 * 60 * 60 * 24);
    }

    public String findDay(String dateStr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse(dateStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayIndex = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        return days[dayIndex];
    }

}

public class ex1 {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        MyDate myDate = new MyDate();
        int option;

        do {
            System.out.println("==== Menu ===");
            System.out.println("1. Current date and time");
            System.out.println("2. Calculate days btw two dates");
            System.out.println("3. Find the day of the week");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Current datetime is: ");
                    myDate.getCurrentDate();
                    break;

                case 2:
                    try {
                        System.out.print("First date (dd/MM/yyyy): ");
                        String d1 = scanner.nextLine();
                        System.out.print("Second date (dd/MM/yyyy): ");
                        String d2 = scanner.nextLine();
                        long days = myDate.calculateDaysBtwDates(d1, d2);
                        System.out.println("Difference between two dates is: " + days + " days");
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use dd/MM/yyyy.");
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Input a date (dd/MM/yyyy): ");
                        String inputDate = scanner.nextLine();
                        String day = myDate.findDay(inputDate);
                        System.out.println("The day is: " + day);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use dd/mm/yyyy.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our program><");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();
        } while (option != 4);

        scanner.close();
    }
}
