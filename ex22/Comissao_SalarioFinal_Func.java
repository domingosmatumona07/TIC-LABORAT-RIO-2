import java.util.Scanner;

public class Comissao_SalarioFinal_Func {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario, valorVendas;
        double comissao, salarioFinal;

        System.out.println("Digite com o salario fixo do funcionario:");
        salario = scanner.nextDouble();
        System.out.println("Digite o valor de suas vendas:");
        valorVendas = scanner.nextDouble();
        scanner.close();
        

        comissao = (valorVendas * 4) / 100;
        salarioFinal = salario + comissao;

        System.out.println("\nA comissao do funcionario vale: " + comissao);
        System.out.println("\nO salario final do funcionario vale: " + salarioFinal);
    }
}