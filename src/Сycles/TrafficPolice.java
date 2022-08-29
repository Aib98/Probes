package Сycles;
// ДПС
// В первый день дежурства сотрудник ДПС оштрафовал 5 водителей.
// Каждый последующий день он штрафует на одного водителя больше.
// Определить, сколько водителей было оштрафовано в N-й день? за N дней?
// (N – число, вводимое с клавиатуры)

import java.util.Scanner;
public class TrafficPolice {
    public static void main(String[] args) {
        int theFirstDayDriver = 5;
        int totalDays;
        int totalDriverInDay;
        int totalDriveWithDay;

        Scanner scanner = new Scanner(System.in);
        totalDays = scanner.nextInt();
        totalDriverInDay = theFirstDayDriver + totalDays;
        System.out.println("Кол-во оштрафованных водителей на "+ totalDays + " день. Равно: "+ totalDriverInDay);
        for (int i = 0; i < 1; i++) {
            totalDriveWithDay = totalDays*(2*theFirstDayDriver + totalDays-1)/2;
            System.out.println("Кол-во оштрафованных водителей за "+totalDays+ " дней. Равно: "+totalDriveWithDay);
        }
    }
}
