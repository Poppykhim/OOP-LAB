
import java.util.Scanner;

class Setting {

    void Menu() {
        System.out.println("Phone Setting: ");
        System.out.printf("%-15s %-3s\n", "1. General", ">");
        System.out.printf("%-15s %-3s\n", "2. Wi-Fi", ">");
        System.out.printf("%-15s %-3s\n", "3. Bluetooth", ">");
        System.out.printf("%-15s %-3s\n", "4. Mobile Data", ">");
        System.out.printf("%-15s %-3s\n", "5. Hotspot", ">");
        System.out.printf("%-15s %-3s\n", "6. Notification", ">");
        System.out.printf("%-15s", "0. Quit");
    }

    void general() {
        System.out.println("\nGeneral:");
        System.out.printf("%-15s %s\n", "1. About", ">");
        System.out.printf("%-15s %s\n", "2. Software update", ">");
        System.out.printf("%-15s %s\n", "3. Storage", ">");
        System.out.printf("%-15s\n", "0. Back");
    }

    void generalToAbout() {
        System.out.println("\nGeneral > About:");
        System.out.printf("%-15s %s\n", "Name", "iPhone");
        System.out.printf("%-15s %s\n", "Model", "IXs");
        System.out.printf("%-15s %s\n", "Version", "18.5");
        System.out.printf("%-15s\n", "0. Back");
    }

    void generalToSU() {
        System.out.println("\n======================");
        System.out.println("Software is up to date");
        System.out.println("======================");
        System.out.printf("%-15s\n", "0. Back");
    }

    void wifi() {
        System.out.println("\nWi-Fi:");
        System.out.printf("%-15s %s\n", "Status", "On");
        System.out.printf("%-15s %s\n", "Network", "I-Coffee");
        System.out.printf("%-15s %s\n", "1. Other networks", ">");
        System.out.printf("%-15s\n", "0. Back");
    }

    void wifiToON() {
        System.out.println("\nWi-Fi > Other networks:");
        System.out.printf("%-15s %s\n", "Bayon coffee", "*****");
        System.out.printf("%-15s %s\n", "Angkor coffee", "**");
        System.out.printf("%-15s %s\n", "Brown coffee", "****");
        System.out.printf("%-15s %s\n", "Koi", "*");
        System.out.printf("%-15s\n", "0. Back");
    }

    void otherSetting(String title) {
        System.out.println(title);
        System.out.println("\n============================");
        System.out.println("The Feture is not available");
        System.out.println("============================");
        System.out.printf("%-15s\n", "0. Back");
    }

}

public class ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Setting phone_setting = new Setting();

        int choice;

        do {

            int generalChoice;
            int wifiChoice;

            System.out.println();
            phone_setting.Menu();
            System.out.print("\nChoice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    do {

                        int choiceInGeneral;
                        phone_setting.general();
                        System.out.print("Choice: ");
                        generalChoice = scanner.nextInt();

                        switch (generalChoice) {
                            case 1:
                                do {
                                    phone_setting.generalToAbout();
                                    System.out.print("\nChoice: ");
                                    choiceInGeneral = scanner.nextInt();
                                } while (choiceInGeneral != 0);
                                break;
                            case 2:
                                do {
                                    System.out.println("\nGeneral > Software Update:");
                                    phone_setting.generalToSU();
                                    System.out.print("\nChoice: ");
                                    choiceInGeneral = scanner.nextInt();
                                } while (choiceInGeneral != 0);
                                break;
                            case 3:
                                do {
                                    System.out.println("\nGeneral > Storage:");
                                    phone_setting.generalToSU();
                                    System.out.print("\nChoice: ");
                                    choiceInGeneral = scanner.nextInt();
                                } while (choiceInGeneral != 0);
                                break;

                        }

                    } while (generalChoice != 0);
                    break;

                case 2:

                    do {

                        int choiceInWifi;
                        phone_setting.wifi();
                        System.out.print("\nChoice: ");
                        wifiChoice = scanner.nextInt();

                        switch (wifiChoice) {
                            case 1:
                                do {
                                    phone_setting.wifiToON();
                                    System.out.print("\nChoice: ");
                                    choiceInWifi = scanner.nextInt();
                                } while (choiceInWifi != 0);
                                break;
                        }

                    } while (wifiChoice != 0);
                    break;

                case 3:
                    int opt;
                    do {
                        phone_setting.otherSetting("\nBluetooth");
                        System.out.print("Choice: ");
                        opt = scanner.nextInt();
                    } while (opt != 0);
                    break;
                case 4:
                    do {
                        phone_setting.otherSetting("\nMobile Data");
                        System.out.print("\nChoice: ");
                        opt = scanner.nextInt();
                    } while (opt != 0);
                    break;
                case 5:
                    do {
                        phone_setting.otherSetting("\nHotspot");
                        System.out.print("Choice: ");
                        opt = scanner.nextInt();
                    } while (opt != 0);
                    break;
                case 6:
                    do {
                        phone_setting.otherSetting("\nNotification");
                        System.out.print("Choice: ");
                        opt = scanner.nextInt();
                    } while (opt != 0);
                    break;

            }
        } while (choice != 0);

        System.out.println("\nThank you for using our Program ><");

        scanner.close();

    }

}
