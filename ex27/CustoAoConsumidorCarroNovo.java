import java.util.Scanner;

public class CustoAoConsumidorCarroNovo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Preco de fabrica do veiculo: ");
        double precoFabricaVeiculo = reader.nextDouble();
        System.out.print("Percentual de lucro do distribuidor: ");
        float percentLucroDistr = reader.nextFloat();
        System.out.print("Percentual de impostos: ");
        float percentImpostos = reader.nextFloat();
        reader.close();

        double custoFinal, valorLucroDistr, valorImpostos;

        valorLucroDistr = (precoFabricaVeiculo * percentLucroDistr) / 100;
        valorImpostos = (precoFabricaVeiculo * percentImpostos) / 100;
        custoFinal = precoFabricaVeiculo + valorLucroDistr + valorImpostos;

        System.out.println("\nO valor correspondente ao lucro do distribuidor eh: " + valorLucroDistr);
        System.out.println("O valor correspondente aos impostos eh: " + valorImpostos);
        System.out.println("O preco final do veiculo eh: " + custoFinal);
        
    }
}
