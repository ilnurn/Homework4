package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        int i = 0;

        while (i < 10) {
            i += 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }

        // Задание 2
        System.out.println();

        int firstFriday = 3;

        for (int d = firstFriday; d <= 31; d = 7 + d) {
            System.out.println("Сегодня пятница, " + d + "-е число. Необходимо подготовить отчет.");
        }

        // Задание 3
        int year = 2022;
        int t = 0;
        for (; t <= year; t = t + 79) {
            if (t >= year - 200) {
                System.out.println(t);
            }
        }
        System.out.println(t);

        // Задание 4
        for (int a = 1; a <= 30; a = a + 1) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a + ": ping pong");
            } else if (a % 3 == 0) {
                System.out.println(a + ": ping");
            } else if (a % 5 == 0) {
                System.out.println(a + ": pong");
            } else {
                System.out.println(a + ":");
            }
        }

        // Задание 5 (for)
        int k = 0;
        int l = 1;

        for (int j = 1; j <= 5; j++) {
            System.out.print(k + " " + l + " ");
            k = k + l;
            l = k + l;
        }

        // Задание 5 (while)
        System.out.println();

        k = 0;
        l = 1;

        int s = 1;
        while (s++ <= 5) {
            System.out.print(k + " " + l + " ");
            k = k + l;
            l = k + l;
        }

        // Задание 6
        System.out.println();

        int age = 19;
        int salary = 58_000;
        int limit;

        if (age >= 23) {
            limit = 3 * salary;
        } else {
            limit = 2 * salary;
        }
        if (salary >= 50_000 && salary < 80_000) {
            limit = (int) (1.2 * limit);
        } else if (salary >= 80_000) {
            limit = (int) (5 * limit);
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

        //Задание 7
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;

        float baseRate = 10;
        int loanTerms;
        float maxMonthlyPayment = 50;

        if (age < 23) {
            baseRate = baseRate + 1;
        } else if (age >= 23 && age < 30) {
            baseRate = (float) (baseRate + 0.5);
        }
        maxMonthlyPayment = (maxMonthlyPayment / 100) * salary;
        float monthlyRatePayment = (wantedSum * (baseRate / 100)) / 12;
        System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. Платеж по кредиту " + monthlyRatePayment + " рублей. ");
        if (maxMonthlyPayment >= monthlyRatePayment) {
            System.out.print("Одобрено");
        } else {
            System.out.print("Отказано");
        }

    }
}
