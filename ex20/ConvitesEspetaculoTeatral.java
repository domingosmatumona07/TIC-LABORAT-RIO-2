import java.util.Scanner;

public class ConvitesEspetaculoTeatral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o custo do espetaculo: ");
        double cursoEspetaculo = scanner.nextDouble();
        System.out.print("Digite o preco do convite: ");
        double precoConvite = scanner.nextDouble();

        int qtdConvites = (int)(cursoEspetaculo / precoConvite);

        System.out.println();
        System.out.println("A qtd de convites que devem ser vendidos para que, pelo menos, o custo do espetaculo seja alcancado eh: " + qtdConvites);
    }
}