import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[]args) {

        System.out.println("Digite a quantidade de degraus da escada");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println (" ".repeat(n - i) + "*".repeat(i));

        }
        scanner.close();
    }
}
