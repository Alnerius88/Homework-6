public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
        task9 ();
        task10 ();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i = i + 1 ) {
            System.out.println(i);
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        for (int i = 10; i >= 0; i = i - 1 ) {
            System.out.println(i);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        for (int n = 0; n < 17; n = n + 2) {
            System.out.println(n);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        for (int n = 10; n >= -10; n = n - 1) {
            System.out.println(n);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year = year + 4 ) {
            System.out.println(year + " год является високосным");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int n = 7; n <= 98; n =n + 7) {
            System.out.println(n);
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int n = 1; n <= 512; n = n * 2) {
            System.out.println(n);
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        for (int month = 1; month <= 12; month++) {
            int moneyTank = 29000 * month;
            System.out.println("Месяц " + month +", сумма накоплений равна " + moneyTank + " рублей");
        }
    }
    public static void task9 () {
        System.out.println("Задача 9");
        int monthMoney = 29000;
        int totalBank = 0;
        for (int month = 1; month <= 12; month++ ) {
            totalBank = (monthMoney * month) + (totalBank/100);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalBank +" рублей");
        }
    }
    public static void task10 () {
        System.out.println("Задача 10");
        for (int n = 1; n <= 10; n++) {
            int result = 2 * n;
            System.out.println("2*" + n + "="+result);
        }
    }
}