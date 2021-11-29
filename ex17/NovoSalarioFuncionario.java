import java.util.Scanner;

public class NovoSalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o salario do funcionario:");
        double salario = scanner.nextDouble();
        double novoSalario = salario + (salario * 25 / 100);

        System.out.println("\nO novo salario com aumento com 25% eh de: " + novoSalario);
    }
}