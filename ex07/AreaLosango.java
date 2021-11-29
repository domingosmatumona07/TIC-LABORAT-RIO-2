import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da diagonal maior: ");
        float diagMaior = scanner.nextFloat();
        System.out.print("Digite o valor da diagonal menor: ");
        float diagMenor = scanner.nextFloat();

        float areaLosango = (diagMaior * diagMenor) / 2;

        System.out.println("\nA area do losango eh igual a " + areaLosango);
    }
}