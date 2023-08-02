public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int clientOS = 1;
        clientOS = 2;
        if (clientOS == 0) {
            System.out.println("Система, которую использует клиент, iOS");
        } else if (clientOS == 1) {
        } else if (clientOS == 2) {
            System.out.println("Система, которую использует клиент, Android");
        } else {
            System.out.println("Система, которую использует клиент, не распознана! Дальнейшие действия для работы прекращены!");
        }
        switch (clientOS) {
            case 0:
            case 1:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 2:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Для правильной работы, пожалуйста, используйте систему iOS или Android!");
        }
        // Задача №2
        System.out.println("Задача №2");
        int clientDeviceYear = 2014;
        clientDeviceYear = 2022;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            if (clientOS == 2 && clientDeviceYear >= 2023) {
                System.out.println("Ваша версия системы iOS подходит для корректной работы");
            } else {
                if (clientOS == 0 && clientDeviceYear < 2015)
                    if (clientOS == 2 && clientDeviceYear < 2023)
                        System.out.println("Версия системы iOS устарела. Установите облегченную версию приложения для iOS по ссылке");
            }
            if (clientOS == 1 && clientDeviceYear >= 2015) {
                if (clientOS == 2 && clientDeviceYear >= 2023) {
                    System.out.println("Ваша версия системы Android подходит для корректной работы");
                } else {
                    if (clientOS == 1 && clientDeviceYear < 2015)
                        if (clientOS == 2 && clientDeviceYear < 2023)
                            System.out.println("Версия системы Android устарела. Установите облегченную версию приложения для Android по ссылке");
                }
                // Задача №3
                System.out.println("Задача №3");
                System.out.println("Программа, которая вычисляет, является ли год високосным");
                int year = 2021;
                year = 2024;

                boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

                if (isLeapYear) {
                    System.out.println(year + " год является високосным.");
                } else {
                    System.out.println(year + " год не является високосным.");
                }
                // Задача №4
                System.out.println("Задача №4");
                System.out.println("Программа вычесления срока доставки продукта компании (банковской карты)");
                double deliveryWithin = 15;
                double maxKmPerFirstDay = 20;
                double maxKmPerEveryNextDays = 40;
                double firstDayPerDelivery = 1;
                double distanceRemainingAfterTheFirstDay = deliveryWithin - maxKmPerFirstDay;
                double nextDaysPerDelivery = ((deliveryWithin - maxKmPerFirstDay) / maxKmPerEveryNextDays);
                double deliveryTime = nextDaysPerDelivery + firstDayPerDelivery;
                if (distanceRemainingAfterTheFirstDay <= 0) {
                    System.out.println("Потребуется " + firstDayPerDelivery + " день");
                } else {
                    System.out.println("Потребуется дней: " + Math.ceil(deliveryTime));
                }
                // Задача №5
                System.out.println("Задача №5");
                int monthNumber = 12;
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("Зима");
                        break;
                    case 3:
                    case 5:
                    case 4:
                        System.out.println("Весна");
                        break;
                    case 6:
                    case 8:
                    case 7:
                        System.out.println("Лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Осень");
                        break;
                    default:
                        System.out.println("Добавить номер месяца");
                }
            }
        }
    }
}