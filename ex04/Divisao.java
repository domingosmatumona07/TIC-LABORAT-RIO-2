import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        float divisao = num1 / num2;

        System.out.println("A divisao eh igual a " + divisao);
    }
}