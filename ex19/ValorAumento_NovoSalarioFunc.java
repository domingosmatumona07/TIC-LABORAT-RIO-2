import java.util.Scanner;

public class ValorAumento_NovoSalarioFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o salario do funcionario:");
        double salario = scanner.nextDouble();
        System.out.println("Entre com o percentual de aumento:");
        float percentAumento = scanner.nextFloat();
        double valorAumento = (salario * percentAumento) / 100;
        double novoSalario = salario + valorAumento;

        System.out.println("\nO valor do aumento eh de: " + valorAumento);
        System.out.println("\nO novo salario eh: " + novoSalario);
    }
}