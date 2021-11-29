import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int subtracao = num1 - num2;

        System.out.println("A subtracao dos numeros eh " + subtracao);
    }
}