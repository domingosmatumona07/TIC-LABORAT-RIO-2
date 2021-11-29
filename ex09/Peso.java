import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        float pesoKilogramas = scanner.nextFloat();

        float pesoGramas = pesoKilogramas * 1000;

        System.out.println("\nO peso em gramas eh = " + pesoGramas + "g");
    }
}