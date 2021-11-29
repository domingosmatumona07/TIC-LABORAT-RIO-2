import java.util.Scanner;

public class Conversoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pé = 12 polegadas
        // 1 jarda = 3 pés
        // 1 milha = 1,760 jardas

        System.out.print("Entre com a medida em pes: ");
        float medidaEmPes = scanner.nextFloat();

        float medidaEmPolegadas = medidaEmPes * 12;
        float medidaEmJardas = medidaEmPes / 3;
        // float medidaEmMilhas = medidaEmPes / (1.760f * 3);
        float medidaEmMilhas = medidaEmJardas / 1.760f;

        System.out.println("\nConversoes realizadas\n");
        System.out.println("Medida em Polegadas: " + medidaEmPolegadas);
        System.out.println("Medida em Jardas: " + medidaEmJardas);
        System.out.println("Medida em Milhas: " + medidaEmMilhas);
    }
}