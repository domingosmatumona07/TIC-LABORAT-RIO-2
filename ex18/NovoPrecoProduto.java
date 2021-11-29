import java.util.Scanner;

public class NovoPrecoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o preco do produto:");
        double precoProduto = scanner.nextDouble();
        double novoPrecoProduto = precoProduto - (precoProduto * 10 / 100);

        System.out.println("\nO novo preco com desconto de 10% eh de: " + novoPrecoProduto);
    }
}