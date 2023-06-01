import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        System.out.println("===============================");
        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = input.nextInt();
            numeros.add(numero);
        }

        System.out.println("Números digitados: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}