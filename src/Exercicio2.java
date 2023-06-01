import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Vamos ver os dias da semana! ");
        System.out.println("---------------");

        System.out.println("Digite um número de 1 a 7: ");
        int resposta = input.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("É Domigo!");
                break;
            case 2:
                System.out.println("É Segunda-feira!");
                break;
            case 3:
                System.out.println("É Terça-feira!");
                break;
            case 4:
                System.out.println("É Quarta-feira!");
                break;
            case 5:
                System.out.println("É Quinta-feira!");
                break;
            case 6:
                System.out.println("É Sexta-feira!");
                break;
            case 7:
                System.out.println("É Sábado!");
                break;
        }
    }
}
