import java.util.Scanner;

public class Salario {
    public static void main(String[] args0) {
        Scanner reader = new Scanner(System.in);

        int horasTrabalhadas = reader.nextInt();
        double salarioMinimo = reader.nextDouble();

        double valorHoraTrabalhada, salarioBruto, salarioFinal;
        float imposto;

        valorHoraTrabalhada = salarioMinimo / 2;
        salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        imposto = ((float)salarioBruto * 3) / 100;
        salarioFinal = salarioBruto - imposto;

        System.out.printf("\nO salario a receber vale: " + salarioFinal);

        reader.close();
    }
}
