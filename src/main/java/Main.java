import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe calkowita: ");
        int n = scanner.nextInt();

        long silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia *= i;
        }

        System.out.println("Silnia z " + n + " wynosi: " + silnia);
        scanner.close();
    }
}