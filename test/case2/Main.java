package case2;
import java.util.Scanner;

public class Main {
    static double euclideanDistance(double ax, double ay, double bx, double by) {
        return Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ax = scanner.nextDouble();
        var ay = scanner.nextDouble();
        var bx = scanner.nextDouble();
        var by = scanner.nextDouble();
        var res = euclideanDistance(ax, ay, bx, by);
        System.out.printf("Euclidean Distance: %.2f", res);
    }
}