import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class SalarioFunc_Desc_Aum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario, gratif, imposto;

        System.out.println("Entre com o salario base do funcionario:");
        salario = scanner.nextDouble();
        scanner.close();
        gratif = (salario * 5) / 100;
        imposto = (salario * 7) / 100;

        double novoSalario = salario + gratif - imposto;

        System.out.println("\nO salario a receber eh = " + novoSalario);
    }
}