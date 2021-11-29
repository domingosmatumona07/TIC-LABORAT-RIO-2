import java.util.Scanner;

public class Salario_a_Receber_Func {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario, gratif, imposto;

        System.out.println("Entre com o salario base do funcionario (R$):");
        salario = scanner.nextDouble();
        scanner.close();
        gratif = 50.0f;
        imposto = (salario * 10) / 100;
        salario -= imposto;

        double novoSalario = salario + gratif;

        System.out.println("\nO salario a receber eh = " + novoSalario);
    }
}