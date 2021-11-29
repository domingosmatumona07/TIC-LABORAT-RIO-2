import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();

        float mediaAritm = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media aritmetica eh igual a " + mediaAritm);
    }
}