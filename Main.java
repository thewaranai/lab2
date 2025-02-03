import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите верхний предел:");
        int n = in.nextInt();
        System.out.println("Введите x");
        double x = in.nextDouble();
        double sum = 0;
        for (int i  = 0; i <= n; i++)
        {
            sum += (Math.pow(-1, n)) * (Math.pow(x, n)) / (getFactorial(n));
        }
        System.out.println(sum);
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}