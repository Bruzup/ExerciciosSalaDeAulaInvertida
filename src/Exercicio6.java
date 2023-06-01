import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("******************* VAMOS DESCOBRIR O INTERVALO ENTRE VALORES? *********************");

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

        //Cria-se uma lista chamada numerosIntervalo para guardar os números do intervalo dentro dela
        List<Integer> numerosIntervalo = new ArrayList<>();

        //Verificador de qual número é o maior e qual é o menor
        int menor = Math.min(primeiroNumero, segundoNumero);
        int maior = Math.max(primeiroNumero, segundoNumero);

        //Neste laço, conseguiremos inserir os números do intervalo dentro da lista acrescentando 1 no menor e tirando 1 do maior, não pegamos os número digitados como intervalo
        for (int i = menor + 1; i <= maior -1; i++) {
            numerosIntervalo.add(i);
        }
        System.out.println("Números no intervalo [" + primeiroNumero  + ", " + segundoNumero + "]:");
        System.out.println(numerosIntervalo);

        }
}
