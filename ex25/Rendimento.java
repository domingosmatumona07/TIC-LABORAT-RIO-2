import java.util.Scanner;

public class Rendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorDeposito, valorTaxaJuros;
        double rendimento, valTotRendimento;

        System.out.print("Digite o valor do deposito: ");
        valorDeposito = scanner.nextDouble();
        System.out.print("Digite o valor da taxa de juros: ");
        valorTaxaJuros = scanner.nextDouble();
        scanner.close();

        rendimento = valorTaxaJuros;
        valTotRendimento = valorDeposito + rendimento;

        System.out.println("O valor do rendimento eh: " + rendimento);
        System.out.println("O valor total depois do rendimento eh: " + valTotRendimento);
    }
}