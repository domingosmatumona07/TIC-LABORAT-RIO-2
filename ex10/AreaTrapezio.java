import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base maior: ");
        float baseMaior = scanner.nextFloat();
        System.out.print("Base menor: ");
        float baseMenor = scanner.nextFloat();
        System.out.print("Altura: ");
        float altura = scanner.nextFloat();

        float areaTrapezio = ((baseMaior * baseMenor) * altura) / 2;

        System.out.println("\nA area do Trapezio eh igual a: " + areaTrapezio);
    }
}