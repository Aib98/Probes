package Сycles;
import java.util.Scanner;
public class DividingANumber {
    static void pluse(int totalPluse, String numberOfDivisors) {
        for (int j = 1; j <= totalPluse; j++) {
            System.out.print(numberOfDivisors);
        }
    }
    static int totalAdvantages(int n) {
        int totalPluse = 0;
        int totalDivisors;
        for (int i = 1; i <= n; i++) {
            double sum = 1.0 * (n) / (i);
            totalDivisors = (int) sum;
//            System.out.println(totalDivisors+" Вычисления "+sum+" Вводимое число: " + n + " Порядковый номер: " + i);
            if (sum - totalDivisors == 0) {
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
        System.out.print(n);
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            pluse(totalAdvantages(i +1), numberOfDivisors);
        }
    }
}


