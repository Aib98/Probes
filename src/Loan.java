public class Loan {
    public static void main(String[] args) {
        int n = 5; // кол-во лет
        double p = 17.2; // %
        int s = 3000000; // займ

        double m; // месячный платеж
        double r = p / 100;
        double d = Math.pow(1 + r, n);
        m = Math.floor(s * r * d / (12 * (d - 1)));
        System.out.println(m + " руб.");
    }
}
