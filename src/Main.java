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
                "Сколько у Вас монет по 10 копеек?",
                "Сколько у Вас монет по 5 копеек?"};

        int[] money = {a, b, c, d};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Ваш ответ: ");
            Scanner answer2 = new Scanner(System.in);
            int pushKey = answer2.nextInt();
            for (int j = 0; j < 1; j++) {
                System.out.println(money[i] * pushKey + " коп.");
            }
            amonut2 = amonut2 + money[i] * pushKey;
        }
        double amountRub2 = amonut2 / 100.0;
        System.out.println("Итого общая сумма:" + '\n' + amonut2 + " коп" + " или " + amountRub2 + " руб." + '\n');


        System.out.println("Сколько у Вас монет по 50 копеек?");
        Scanner answer = new Scanner(System.in);
        int ans = answer.nextInt();
        amount = amount + ans * a;
        System.out.println(ans * a + " коп");

        System.out.println("Сколько у Вас монет по 10 копеек?");
        Scanner answer2 = new Scanner(System.in);
        int ans2 = answer2.nextInt();
        amount = amount + ans2 * b;
        System.out.println(ans2 * b + " коп");

        System.out.println("Сколько у Вас монет по 5 копеек?");
        Scanner answer3 = new Scanner(System.in);
        int ans3 = answer3.nextInt();
        amount = amount + ans3 * c;
        System.out.println(ans3 * c + " коп");

        System.out.println("Сколько у Вас монет по 5 копеек?");
        Scanner answer4 = new Scanner(System.in);
        int ans4 = answer4.nextInt();
        amount = amount + ans4 * d;
        System.out.println(ans4 * d + " коп");
        System.out.println("Итого общая сумма:");
        double amountRub = amount / 100.0;
        System.out.println(amount + " коп. или " + amountRub + " руб.");

    }
}