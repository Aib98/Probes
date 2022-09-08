package Сycles;
// реализоватть игру камень ножницы бумага.
// В начале игры задает кол-во игр в конце выводим итог

import java.util.Random;
import java.util.Scanner;

public class GameRockPaperScissors {
    static int inputPlayer() {
        Scanner scanner = new Scanner(System.in);
        int player;
        while (true) {
            player = scanner.nextInt();
            if (player >= 1 && player <= 3) {
                break;
            } else {
                System.out.println("Неправильно выбрано значение.");
                System.out.println("Введите число от 1 до 3 где: 1 - Камень; 2 - Ножницы; 3 - Бумага");
            }
        }
        return player;
    }

    static void winner(int victory, int wrongGame) {
        if (victory > wrongGame) {
            System.out.println("Вы победили!");
        } else if (victory == wrongGame) {
            System.out.println("Ничья");
        } else System.out.println("Вы проиграли(");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Какое кол-во игр вы хотели бы сыграть?");
        int n; // кол-во игр
        n = scanner.nextInt();

        int computer;
        int player;
        int victory = 0;
        int quanitiGame = 0;
        int wrongGame = 0;

        do {
            System.out.println("Введите число от 1 до 3 где: 1 - Камень; 2 - Ножницы; 3 - Бумага");
            player = inputPlayer();
            computer = random.nextInt(3) + 1;
            if (player == computer) {
                System.out.println("Ничья " + quanitiGame);

            } else if ((player == 1 && computer == 2) || (player == 2 && computer == 3) || (player == 3 && computer == 1)) {
                System.out.println("Игрок победил " + quanitiGame);
                victory++;
            } else {
                System.out.println("Победил компьютер " + quanitiGame);
                wrongGame++;
            }
            quanitiGame++;
        } while (quanitiGame < n);
        System.out.println("кол-во игр " + quanitiGame + " Заданное кол-во игр " + (n) + " кол-во побед: " + victory);
        winner(victory, wrongGame);
    }
}
