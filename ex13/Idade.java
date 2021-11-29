import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano de Nascimento: ");
        int anoNasc = scanner.nextInt();
        System.out.print("Ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNasc;

        int idadeEm2050 = 0;

        if(anoAtual < 2050) {
            idadeEm2050 = idade + (2050 - anoAtual);
        }

        System.out.println("\nIdade: " + idade + " anos");
        System.out.println("Idade em 2050: " + idadeEm2050 + " anos");
    }
}