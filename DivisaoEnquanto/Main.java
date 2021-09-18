// Escreva um fluxograma e um programa em Java que leia 2 valores e imprima o resultado da divisão do primeiro valor lido pelo segundo valor lido. O programa deve ser finalizado quando o usuário digitar 0 (zero) para o segundo valor. Utilize a estrutura ENQUANTO.
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int valor1;
    int valor2;
    float divisao;
    
    Scanner leitor = new Scanner(System.in);

    System.out.println("Entre com o primeiro valor:");
    valor1 = leitor.nextInt();
    System.out.println("Entre com o segundo valor:");
    valor2 = leitor.nextInt();

    while(valor2 != 0){
      System.out.println("A divisao do primeiro valor inserido pelo segundo resulta em:");
      divisao = (float) valor1/valor2;
      System.out.println(divisao);
      

      System.out.println("--------------------------");
      System.out.println("   ");

      System.out.println(" ");
      System.out.println("Entre com o primeiro valor:");
      valor1 = leitor.nextInt();
      System.out.println("Entre com o segundo valor:");
      valor2 = leitor.nextInt();
    }

  }
  
  
}