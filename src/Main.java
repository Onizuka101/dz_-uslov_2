public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }


    public static void task1() {
        byte clientOS = 1;
        if (clientOS==0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }
        if (clientOS==1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }
    }
    public static void task2() {
        byte clientOS = 1;
        int clientDeviceYear = 2016;
        if (clientOS==0 && clientDeviceYear<2015) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }
        else if (clientOS==0 && clientDeviceYear>=2015)
        {System.out.println("«Установите облегченную версию приложения для iOS по ссылке»"); }
        if (clientOS==1 && clientDeviceYear<2015) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }
        else if (clientOS==1 && clientDeviceYear>=2015)
        {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
        }
    }
    public static void task3() {
        int year = 2025;
        switch (year) {
            case 2020:
            case 2024:
            case 2028:
                System.out.println(year + "год является високосным");
                break;
            case 2021:
            case 2022:
            case 2023:
            case 2025:
            case 2026:
            case 2027:
            case 2029:
            case 2030:
                System.out.println(year + "год не является високосным");
                break;
            default:
                System.out.println("Укажите в задаче условие с временым интервалом, ПЛИЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗЗ");
        }
    }
    public static void task4() {
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней:2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней:3");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

        public static void task5() {
            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("весна");
                    case 6:
                case 7:
                case 8:
                    System.out.println("лето");
                    case 9:
                case 10:
                case 11:
                    System.out.println("осень");
                default:
                    System.out.println("такого месяца не существует");
            }
        }






    }
