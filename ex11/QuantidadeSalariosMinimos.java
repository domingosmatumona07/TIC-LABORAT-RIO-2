import java.util.Scanner;

public class QuantidadeSalariosMinimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salario minimo: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        int qtdSalariosMinimos = (int)(salario / salarioMinimo);

        System.out.println("\nA quantidade de salarios minimos eh: " + qtdSalariosMinimos); 
    }
}