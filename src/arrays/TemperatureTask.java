package arrays;
// посчитать сколько раз встречается макс элемент,
// проверить есть ли в массиве заданная тем-ра,
// найти миним тем-ру за заданную неделю

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TemperatureTask {
    static void fillArray(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(30) + 10;
        }
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static double average(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return (double) sum / a.length;
    }

    static int findMax(int[] a) {
        int max = Integer.MIN_VALUE; //a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int countLocalMax(int[] a) {
        int count = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                count++;
            }
        }
        return count;
    }

    static int countMaxTemperature(int[] a, int n) {
        int countMax = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[n - 1] == a[i]) {
                countMax++;
            }
        }
        return countMax;

    }

    static void searchTemperature(int[] a, int search) {
        int searchCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (search == a[i]) {
                searchCount++;
            }
        }
        if (searchCount > 0) {
            System.out.println("Есть совпадение по поиску заданного числа " + search);
        } else System.out.println("Нет совпадений по поиску заданного числа " + search);
    }

    static int findMin(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        } return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int search = 12;
        int[] a = new int[n];
        fillArray(a);
        printArray(a);

        double avg = average(a);
        System.out.println("Средняя тем-ра = " + avg);

        int max = findMax(a);
        System.out.println("Макс тем-ра = " + max);

        int count = countLocalMax(a);
        System.out.println("Кол-во лок макс = " + count);

        int countMax = countMaxTemperature(a, n);
        System.out.println("Кол-во значений с максимальной температурой = " + countMax);

        searchTemperature(a, search);

        int findMin = findMin(a);
        System.out.println("Мин температура = " + findMin);

    }

}
