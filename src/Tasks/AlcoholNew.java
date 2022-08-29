package Tasks;
import java.util.Scanner;

public class AlcoholNew {
    static int calculation(int atomsC, int atomsH, int atomsO) {
        int c = 2;
        int h = 6;
        int o = 1;
        atomsC = atomsC/c;
        atomsH = atomsH/h;
        atomsO = atomsO/o;
        int min;
        if (atomsC < atomsH && atomsC < atomsO) {
            min = atomsC;
        } else if (atomsH < atomsC && atomsH < atomsO) {
            min = atomsH;
        } else min = atomsO;
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int atomsC = scanner.nextInt();
        int atomsH = scanner.nextInt();
        int atomsO = scanner.nextInt();
        System.out.println(calculation(atomsC, atomsH, atomsO));
    }
}
