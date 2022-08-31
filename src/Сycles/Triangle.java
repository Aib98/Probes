package Сycles;
import java.util.Scanner;
public class Triangle {
    static int calculatesPyramid (int bull){
        int minBull=1;
        int level=0;

        while (bull>=minBull){
            bull=bull-minBull;
            level++;
            minBull++;
        }
        return level;
    }
    public static void main(String[] args) {
        int bull;
        Scanner scanner = new Scanner(System.in);
        bull=scanner.nextInt();
        int rezalt = calculatesPyramid(bull);
        System.out.println(rezalt);
    }





}
