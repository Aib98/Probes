package Tasks;

import java.util.Scanner;

public class TheDayAfterTomorrowCalendar {
    static boolean Years(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
            // високосный
        }
        return false;
    }

    static int Months(int month, int year) {
        int dayM;
        if (month == 2) {
            boolean newYear = Years(year);
            if (newYear == true) {
                dayM = 29;
            } else dayM = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayM = 30;
        } else dayM = 31;
        return dayM;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        day +=2;

        int count = Months(month, year);
        if (day>count){
            day = day -count;
            month ++;
            if (month>12){
                month = 1;
                year++;
            }
        }
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }
}



