import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas");
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();

        System.out.println("\nDigite os pesos");
        int peso1 = scanner.nextInt();
        int peso2 = scanner.nextInt();
        int peso3 = scanner.nextInt();

        float mediaPond = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        System.out.println("A media ponderada eh igual a " + mediaPond);
    }
}