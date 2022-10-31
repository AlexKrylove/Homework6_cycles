public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        for (int a = 0; a <= 10; a++) {
            System.out.println("Iteration: " + a);
        }
        System.out.println("Task2");
        for (int a = 10; a >= 0; a--) {
            System.out.println("Iteration " + a);
        }
        System.out.println("Task3");
        for (int number = 2; number <= 17; number += 2) {
            System.out.println("Четное число:" + number);
        }
        System.out.println("Task4");
        for (int number = 10; number >= -10; number--) {
            System.out.println("В убывающем порядке " + number);
        }
        System.out.println("Task5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println("Task6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("Task7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Task8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Task9");
        int saving = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + saving/100;
            sum = sum + saving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей.");
        }

    }
}


