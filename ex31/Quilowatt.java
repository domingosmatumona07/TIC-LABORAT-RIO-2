import java.util.Scanner;

public class Quilowatt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo, qtdQuilowatts;
        double valorQuilowatt, valorTotal, valorTotalDesconto15;

        salarioMinimo = scanner.nextDouble();
        qtdQuilowatts = scanner.nextDouble();
        scanner.close();

        valorQuilowatt = salarioMinimo / 5;

        valorTotal = valorQuilowatt * qtdQuilowatts;

        valorTotalDesconto15 = valorTotal - (valorTotal * 15) / 100;

        System.out.println("\nValor de cada quilowatt: " + valorQuilowatt);

        System.out.println("Valor a ser pago pela residência: " + valorTotal);
        System.out.println("Valor a ser pago com desconto de 15%: " + valorTotalDesconto15);

    }
}
