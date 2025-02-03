import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите количество членов ряда (n): ");
        int n = scanner.nextInt();
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double term = Math.pow(-1, i) * Math.pow(x, i) / factorial(i);
            sum += term;
        }
        System.out.println("Результат: " + sum);
        scanner.close();
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
