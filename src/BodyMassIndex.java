import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
//        double weight; //кг
//        double height; //см

        System.out.println("Введите вес в кг и рост в см");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        double bMI = weight / Math.pow(height / 100.0, 2);

        if (bMI < 18.5) {
            System.out.println("Недостаточная масса");
        } else if (bMI >= 18.5 && bMI < 25) {
            System.out.println("Норма");
        } else if (bMI >= 25 && bMI < 30) {
            System.out.println("Избыточная масса");
        } else if (bMI >= 30) {
            System.out.println("Ожирение");
        }
        BigDecimal result = new BigDecimal(bMI);
        result = result.setScale(2, RoundingMode.DOWN);
        System.out.println(result);
    }
}
