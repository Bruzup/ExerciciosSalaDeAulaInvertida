import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("==================== VAMOS EXECUTAR A TABUADA! =====================");

        System.out.print("Digite um número inteiro de 1 a 10: ");
        int numero = input.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido. Por favor, digite um número entre 1 e 10.");

        }

        System.out.println("Tabuada de " + numero + ":");


        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

