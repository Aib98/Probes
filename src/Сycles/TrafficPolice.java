package Сycles;
// ДПС
// В первый день дежурства сотрудник ДПС оштрафовал 5 водителей.
// Каждый последующий день он штрафует на одного водителя больше.
// Определить, сколько водителей было оштрафовано в N-й день? за N дней?
// (N – число, вводимое с клавиатуры)
import java.util.Scanner;
public class TrafficPolice {
    static int fineDay(int totalDriverInDay, int totalDays, int theFirstDayDriver) {
        totalDriverInDay = theFirstDayDriver + totalDays;
        System.out.println("Кол-во оштрафованных водителей на " + totalDays + " день. Равно: " + totalDriverInDay);
        return totalDriverInDay;
    }
    static void totalFine(int totalDriveWithDay, int totalDays, int theFirstDayDriver) {
        for (int i = 0; i < 1; i++) {
            totalDriveWithDay = totalDays * (2 * theFirstDayDriver + totalDays - 1) / 2;
            System.out.println("Кол-во оштрафованных водителей за " + totalDays + " дней. Равно: " + totalDriveWithDay);
        }
    }
    public static void main(String[] args) {
        int theFirstDayDriver = 5;
        int totalDays;
        int totalDriverInDay=0;
        int totalDriveWithDay=0;

        Scanner scanner = new Scanner(System.in);
        totalDays = scanner.nextInt();
        fineDay(totalDriverInDay, totalDays, theFirstDayDriver);
        totalFine(totalDriveWithDay, totalDays, theFirstDayDriver);



        }
    }

