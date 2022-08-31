package Сycles;
// Задача-загадка
//Представим, что у нас есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?" Ответ: троллейбус. Можно возражать, конечно, какого цвета сейчас троллейбусы - но мы не об этом.
//Представим, что Вы загадываете эту загадку пользователю. Создайте программу, которая будет считывать с консоли ответ:
//•	у пользователя есть 3 попытки. После трех ответов программа должна завершиться;
//•	если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
//•	если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
//•	если пользователь вводит любой другой ответ, мы выводим в консоль "Подумай еще." и продолжаем цикл.

import java.util.Scanner;

public class TheProblemIsARiddle {
    static void ridlle(String right, String iGiveUp) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i <= 2) {
            String answer = scanner.next();
            if (answer.equalsIgnoreCase(right)) {
                System.out.println("Правильно!");
                i = 3;
            } else if (answer.equalsIgnoreCase(iGiveUp)) {
                i = 3;
                System.out.println("Правильный ответ: " + right);
            } else System.out.println("Подумай еще.");
            i++;
        }
    }

    public static void main(String[] args) {

        String right = "Троллейбус";
        String iGiveUp = new String("Сдаюсь");

        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        System.out.println("Если не знаете напишите - Сдаюсь.");
        ridlle(right, iGiveUp);
    }

}
