import java.util.Scanner;

public class Idade_Parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano de Nascimento: ");
        int anoNasc = scanner.nextInt();
        System.out.print("Ano atual: ");
        int anoAtual = scanner.nextInt();

        int idadeEmAnos, idadeEmMeses, idadeEmSemanas, idadeEmDias;

        idadeEmAnos = anoAtual - anoNasc;
        idadeEmMeses = idadeEmAnos * 12;
        idadeEmSemanas = idadeEmMeses * 4;
        idadeEmDias = idadeEmSemanas * 7; 

        System.out.println("\nIdade em anos: " + idadeEmAnos);
        System.out.println("Idade em meses: " + idadeEmMeses);
        System.out.println("Idade em semanas: " + idadeEmSemanas);
        System.out.println("Idade em dias: " + idadeEmDias);
    }
}