import java.util.Scanner;

public class NovoPesoPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa (Kg): ");
        float peso = scanner.nextFloat();

        float pesoEngord15 = peso + ((peso * 15) / 100);
        float pesoEmagrec20 = peso - ((peso * 20) / 100);

        System.out.println("\nO novo peso se a pessoa engordar 15% eh: " + pesoEngord15 + "Kg"); 
        System.out.println("\nO novo peso se a pessoa emagrecer 20% eh: " + pesoEmagrec20 + "Kg");
    }
}