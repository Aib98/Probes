import java.util.Scanner;

public class MilitaryEnlistmentOffice {

    public static void main(String[] args) {
        System.out.println("Введите свой возраст:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18 && age <= 27) {
            System.out.println("Вы подлежите призыву на срочную службу или может служить по контракту.");
        } else if (age > 27 && age <= 59) {
            System.out.println("Вы можете служить по контракту");
        } else if (age > 0 && age < 100) {
            System.out.println("Вы находитесь в непризывном возрасте");
        } else {
            System.out.println("Возраст указан неправильно");
        }

    }
}
