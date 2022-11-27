import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double p = scanner.nextDouble();
        int procent = (int) (x * p / 100);
        double k = scanner.nextDouble();
        double deposit;
        for (p = 1; p < 100; p++) {
            System.out.println(deposit = (x + (procent * k)));
            break;
        }
    }
}



