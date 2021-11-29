import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base: ");
        float base = scanner.nextFloat();
        System.out.print("Altura: ");
        float altura = scanner.nextFloat();

        float areaTriangulo = (base * altura) / 2;

        System.out.println("\nA area do triangulo eh igual a " + areaTriangulo);
    }
}