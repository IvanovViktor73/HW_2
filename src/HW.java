import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = number - 1; i <= number; i--) {
            if (number % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}

