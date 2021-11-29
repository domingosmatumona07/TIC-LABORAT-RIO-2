import java.util.Scanner;

public class SaldoAtualContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoConta = 0.0, salario, valorPrimeiroCheque, valorSegundoCheque;

        System.out.print("Digite o salario: ");
        salario = scanner.nextDouble();

        saldoConta = salario;

        System.out.print("Montante do 1º cheque: ");
        valorPrimeiroCheque = scanner.nextDouble();
        System.out.println("Montante do 2º cheque: ");
        valorSegundoCheque = scanner.nextDouble();  

        double saldoAtualConta = saldoConta - (((valorPrimeiroCheque) + (valorPrimeiroCheque * 0.38 / 100)) + ((valorSegundoCheque) + (valorSegundoCheque * 0.38 / 100)));
        
        System.out.println("\nO saldo atual da conta eh de: " + saldoAtualConta);

        scanner.close();
    }
}
