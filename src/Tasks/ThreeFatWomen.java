package Tasks;

import java.util.Scanner;

public class ThreeFatWomen {
    static boolean checkMass(int m1, int m2, int m3) {
        if (m1 > 94 && m1 < 727 && m2 > 94 && m2 < 727 && m3 > 94 && m3 < 727) {
            return true;
        } else return false;
    }

    static int findMax(int m1, int m2, int m3) {
        int max;
        if (m1 > m2 && m1 > m3) {
            max = m1;
        } else if (m2 > m1 && m2 > m3) {
            max = m2;
        } else max = m3;
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        boolean check = checkMass(m1, m2, m3);

        if (check == true) {
            int max = findMax(m1, m2, m3);
            System.out.println(max);
        }else System.out.println("Error");


    }
}
