import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();

        float multiplicacao = num1 * num2 * num3;

        System.out.println("A multiplicacao eh igual a " + multiplicacao);
    }
}