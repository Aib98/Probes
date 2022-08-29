package Сycles;
<<<<<<< HEAD
// Проверка таблицы умножения
//Пользователь вводит кол-во примеров = N.
// Компьютер рандомно генерирует примеры (два числа от 1 до 10) и выводит пример в виде 3 * 7 =.
// Пользователь вводит ответ и считаем кол-во правильных ответов.
// В конце выводим оценку (функция конвертации процента в оценку)
=======
>>>>>>> origin/main

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number1;
        int number2;
        int count = 0;

        Random random = new Random();
        int quantity = random.nextInt(7)+1;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantity; i++) {
            number1 = random.nextInt(9) + 1;
            number2 = random.nextInt(9) + 1;
            int correctResult = number1 * number2;
            System.out.println("Умножте " + number1 + " на " + number2);
            int result = scanner.nextInt();
            if (result == correctResult) {
                System.out.println("Ответ правильный");
                count++;
            } else {
                System.out.println("Ответ ошибочный");
            }
                    }
        double p = 100.0*count/quantity;
        System.out.println("Итого: " + p + "%");
    }
}
