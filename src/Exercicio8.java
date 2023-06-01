import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        System.out.println("===============================");
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i) + ": ");
            int numero = input.nextInt();
            numeros.add(numero);
        }
        System.out.println("Números digitados na ordem inversa:");
        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.println(numeros.get(i));
        }
    }
}