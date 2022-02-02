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

    }
}
