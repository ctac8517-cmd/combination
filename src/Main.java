//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("Homework:'Conditional operation:combination'");

        System.out.println("Задача 1");

        System.out.println("Выбирите тип операционной системы установленной на вашем телефоне, где '0'-это iOS, а '1'-это Android.");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");

        System.out.println("Выбирите тип операционной системы установленной на вашем телефоне, где '0'-это iOS, а '1'-это Android.");
        System.out.println("Укажите год выпуска вашего телефона");
        int clientOS1 = 1;
        int clientDeviceYear = 2014;
        if (clientOS1 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }

            System.out.println("Задача 3");

            int year = 2021;
            boolean isEveryFourthYear = (year % 4 == 0);
            boolean isNotEveryHundredthYear = (year % 100 != 0);
            boolean isEveryFourHundredthYear = (year % 400 == 0);
            boolean isModernCalendar = (year > 1584);
            if (isModernCalendar && ((isEveryFourthYear && isNotEveryHundredthYear) || isEveryFourHundredthYear)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }

            System.out.println("Задача 4");

            int deliveryDistance = 95;
            int deliveryTime = 1;
            System.out.println("Минимальный срок доставки карты " + deliveryTime + " день");
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней " + deliveryTime);
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryTime += 1;
                System.out.println("Потребуется дней " + deliveryTime);
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryTime += 2;
                System.out.println("Потребуется дней " + deliveryTime);
            } else {
                System.out.println("Доставки нет.");
            }

            System.out.println("Задача 5");

            int monthNumber = 13;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осенний месяц");
                    break;
                default:
                    System.out.println("Такого месяца не существует!");
            }
        }
    }
