import java.util.Scanner;

public class OperacoesComNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite o numero (positivo e maior que zero): ");
        numero = scanner.nextInt();
        scanner.close();

        System.out.printf("\nO numero ao quadrado eh igual: " + (numero * numero) + "\n");
        System.out.println("O numero ao cubo eh igual a: " + (numero * numero * numero));
        System.out.println("A raiz quadrada eh: " + Math.sqrt(numero));
        System.out.println("A raiz cubica eh: ");

    }
}
