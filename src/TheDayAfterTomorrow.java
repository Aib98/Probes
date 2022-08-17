import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TheDayAfterTomorrow {
    public static void main (String[] args){
        int year = 2018;
        int month = 2; //Отсчет начинается с нуля (т.е. декабрь это 11 месяц) Поэтому вычитаем 1 день
        int day = 30;

        Calendar calendar = new GregorianCalendar(year, month-1, day);
        calendar.set(Calendar.HOUR_OF_DAY, 19);
        calendar.set(Calendar.MINUTE, 25);
        calendar.set(Calendar.SECOND, 59);
        System.out.println(calendar.getTime());
        System.out.println("Введите кол-во дней:");

        Scanner scanner = new Scanner(System.in);
        int dayPlus = scanner.nextInt();

        calendar.add(Calendar.DAY_OF_MONTH, dayPlus);
        Date date1 = calendar.getTime();
        System.out.println(date1);
    }
}
