package Сycles;
// Проверка таблицы умножения
//Пользователь вводит кол-во примеров = N.
// Компьютер рандомно генерирует примеры (два числа от 1 до 10) и выводит пример в виде 3 * 7 =.
// Пользователь вводит ответ и считаем кол-во правильных ответов.
// В конце выводим оценку (функция конвертации процента в оценку) !!! Доделать

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {
    static int multiplication(int quantity) {
        Random random = new Random();
        int number1 = 0;
        int number2 = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantity; i++) {
            number1 = random.nextInt(9) + 1;
            number2 = random.nextInt(9) + 1;
            int correctResult = number1 * number2;
            System.out.println("Умножьте " + number1 + " на " + number2);
            int result = scanner.nextInt();
            if (result == correctResult) {
                System.out.println("Ответ правильный");
                count++;
            } else {
                System.out.println("Ответ ошибочный");
            }
        }
        return count;
    }

    static int estimation(int count, int quantity) {
        double p = 100.0 * count / quantity;
        int rezalt;
        if (p >= 80) {
            rezalt = 5;
        } else if (p < 80 && p >= 60) {
            rezalt = 4;
        } else if (p < 60 && p >= 40) {
            rezalt = 3;
        } else {
            rezalt = 2;
        }
        return rezalt;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int quantity;
        quantity = random.nextInt(7) + 1;
        int count = multiplication(quantity);
        System.out.println("Ваша оценка " + estimation(count, quantity));
    }
}
