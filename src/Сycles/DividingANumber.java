package Сycles;

import java.util.Scanner;

public class DividingANumber {
    static void pluse(int totalPluse, String numberOfDivisors) {
        for (int j = 1; j <= totalPluse; j++) {
            System.out.print(numberOfDivisors);
        }
        System.out.println();
    }

    static int totalAdvantages(int n) {
        int totalPluse = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                totalPluse++;
            }
        }
        return totalPluse;
    }

    public static void main(String[] args) {
        int n; // вводимое число
        String numberOfDivisors = "+"; // графическое определение делителей
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            pluse(totalAdvantages(i), numberOfDivisors);
        }
    }
}


