import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        printLeapYear(2018); // task1
        printOsYear(0, 2022); // task2
        System.out.print("Потребуется дней: " + deliveryDistance(95)); // task3
    }

    public static void printLeapYear(int year) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.printf("Номер года - %d високосный год.", year);
        } else {
            System.out.printf("Номер года - %d не високосный год.", year);

        }
    }

    public static void printOsYear(int os, int yearOfManufacture) {
        int currentYear = LocalDate.now().getYear();
        String startString;
        String endString = null;
        if (os > 1 || os < 0) {
            System.out.println("\n" + "Версия ОС указана не верно.");
            return;
        }

        if (os == 1) {
            endString = "версию приложения для Андроид по ссылке.";
        }
        if (os == 0) {
            endString = "версию приложения для IOs по ссылке. ";
        }
        if (yearOfManufacture < currentYear) {
            startString = "Установите облегченную ";
        } else {
            startString = "Установите ";
        }

        System.out.println("\n" + startString + endString);
    }

    public static int deliveryDistance(int distance) {

        int deliveryDays = 1;

        if (distance > 20) {
            deliveryDays++;
        }

        if (distance > 60) {
            deliveryDays++;
        }

        return deliveryDays;
    }
}