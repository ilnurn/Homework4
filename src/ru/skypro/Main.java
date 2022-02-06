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
        for (; i > 0; i --) {
            System.out.print(i + " ");
        }

        // Задание 2
        System.out.println();

        int firstFriday = 3;

        for (int d = firstFriday; d <= 31; d += 7) {
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

        // Задание 3 (второй способ)
        for (t = year - 200; t <= year + 100; t++) {
            if (t % 79 == 0) {
                System.out.println(t);
            }
        }

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


    }
}
