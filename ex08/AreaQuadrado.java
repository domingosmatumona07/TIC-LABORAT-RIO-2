import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado: ");
        float lado = scanner.nextFloat();

        float areaQuadrado = lado * lado;

        System.out.println("\nA area do quadrado eh igual a " + areaQuadrado);
    }
}