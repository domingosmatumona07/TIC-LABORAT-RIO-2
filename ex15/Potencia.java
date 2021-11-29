import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        long potencia = 1;

        for(int i = 1; i <= numero2; i++) potencia *= numero1;

        System.out.println("A potencia eh igual a: " + potencia);
    }
}