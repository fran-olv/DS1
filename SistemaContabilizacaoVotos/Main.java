/*Agenda #4 Desenvolvimento de Sistemas 1

codificação em Java para ler o número total de eleitores de um município,o número de votos brancos,nulos e válidos.
//Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
*/
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
//declaracao de variaveis
    int branco, nulo, valido, total;
    
    //double percentualBranco, percentualNulo, percentualValido;

    Scanner leitor = new Scanner(System.in);


  //entrada de dados
    System.out.println("Entre com o número de votos brancos:");
    branco = leitor.nextInt();

    System.out.println("Entre com o número de votos nulos:");
    nulo = leitor.nextInt();

    System.out.println("Entre com o número de votos válidos:");
    valido = leitor.nextInt();

    total = branco + nulo + valido;

    double percentualBranco = (((double) branco)/total);
    double percentualNulo = ((double) nulo)/total;
    double percentualValido = ((double) valido)/total;


    System.out.println("Percentual de Votos Brancos " + percentualBranco*100 + "%");
    System.out.println("Percentual de Votos Nulos " + percentualNulo*100 + "%");
    System.out.println("Percentual de Votos Validos " + percentualValido*100 + "%");

  }
}