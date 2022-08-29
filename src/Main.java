import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int amount = 0;
        int amonut2 = 0;
        int a = 50;
        int b = 10;
        int c = 5;
        int d = 1;

        String[] questions = {"Сколько у Вас монет по 50 копеек?",
                "Сколько у Вас монет по 10 копеек?",
                "Сколько у Вас монет по 5 копеек?",
                "Сколько у Вас монет по 1 копеек?"};

        int[] money = {a, b, c, d};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Ваш ответ: ");
            Scanner answer2 = new Scanner(System.in);
            int pushKey = answer2.nextInt();

                System.out.println(money[i] * pushKey + " коп.");

            amonut2 = amonut2 + money[i] * pushKey;
        }
        double amountRub2 = amonut2 / 100.0;
        System.out.println("Итого общая сумма:" + '\n' + amonut2 + " коп" + " или " + amountRub2 + " руб." + '\n');

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько у Вас монет по 50 копеек?");
        int ans = scanner.nextInt();
        amount = amount + ans * a;
        System.out.println(ans * a + " коп");

        System.out.println("Сколько у Вас монет по 10 копеек?");
        int ans2 = scanner.nextInt();
        amount = amount + ans2 * b;
        System.out.println(ans2 * b + " коп");

        System.out.println("Сколько у Вас монет по 5 копеек?");
        int ans3 = scanner.nextInt();
        amount = amount + ans3 * c;
        System.out.println(ans3 * c + " коп");
        System.out.println("Сколько у Вас монет по 1 копеек?");

        int ans4 = scanner.nextInt();
        amount = amount + ans4 * d;
        System.out.println(ans4 * d + " коп");
        System.out.println("Итого общая сумма:");
        double amountRub = amount / 100.0;
        System.out.println(amount + " коп. или " + amountRub + " руб.");

    }
}