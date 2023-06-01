import java.util.Scanner;
//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

public class Exercicio1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.println("==================== QUE SALGADO VAMOS LEVAR HOJE??=======================");
     System.out.println(" ");

     System.out.println("Qual o preço da coxinha?");
     double precoCoxinha = input.nextDouble();

     System.out.println("Qual o preço da esfiha?");
     double precoEsfiha = input.nextDouble();

     System.out.println("Qual o preço da empada?");
     double precoEmpada = input.nextDouble();

     if(precoCoxinha < precoEsfiha && precoCoxinha < precoEmpada) {
      System.out.println("Você economiza levando a coxinha! :-) ");
     }
     else if (precoEsfiha < precoCoxinha && precoEsfiha < precoEmpada){
      System.out.println("A esfiha é a mais em conta hoje! ! :-) ");
     }
     else if (precoEmpada < precoCoxinha && precoEmpada < precoEsfiha) {
      System.out.println("A empada é o salgado mais econômico hoje! :-) ");
     }
     else {System.out.println("Tanto faz, estão todos com o mesmo valor promocional. Aproveite e se delicie!! :P ");}
    }
}
