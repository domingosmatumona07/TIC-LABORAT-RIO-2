import java.util.Scanner;

public class Racao {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
        System.out.println("Peso do saco de racao (em kg): ");
        float pesoSacoRacao = reader.nextFloat();
        System.out.println("Quantidade de racao fornecida para cada gato (em g): ");
        float qtdRacao = reader.nextFloat();

        float racaoRestanteApos5Dias = (pesoSacoRacao * 1000) - ((qtdRacao * 2) * 5);
        String msgResult = "A quantidade de racao restante sera de: " ;

        if(racaoRestanteApos5Dias < 1000) System.out.println(msgResult + racaoRestanteApos5Dias + "g");
        else System.out.println(msgResult + (racaoRestanteApos5Dias / 1000) + "kg");

        reader.close();
    }
}
