import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double maior = Double.MIN_VALUE;

        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++ QUAL SERÁ O MAIOR NÚMERO? ++++++++++++++++++++++++");

        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            double numero = input.nextDouble();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maior);
    }
}