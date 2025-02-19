public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int clientOS = 1;
        System.out.println("Переменна clientOS " + " : 0 - iOS, 1 - Android");

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Операционная система не распознана.");
        }

        System.out.println("Задание 2");

        int client1OS = 1; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2015;
        System.out.println("Переменна client1OS " + " : 0 - iOS, 1 - Android");

        if (clientDeviceYear < 2015 && client1OS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < 2015 && client1OS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (client1OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (client1OS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Операционная система не распознана.");
        }

        System.out.println("Задание 3");

        int year = 2021;

        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("Год должен быть больше 1584.");
        }

        System.out.println("Задание 4");

        int deliveryDistance = 95;

        if (deliveryDistance > 100) {
            System.out.println("Доставка невозможна.");
        } else {
            int days;
            if (deliveryDistance >= 60) {
                days = 3;
            } else if (deliveryDistance >= 20) {
                days = 2;
            } else {
                days = 1;
            }
            System.out.println("Потребуется дней: " + days);
        }

        System.out.println("Задание 5");
        int monthNumber = 12;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Номер месяца должен быть от 1 до 12.");
        } else {

            String season;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "осень";
                    break;
                default:
                    season = "неизвестно";
                    break;
            }
            System.out.println("Месяц с номером " + monthNumber + " принадлежит к сезону: " + season + ".");
        }


    }
}
