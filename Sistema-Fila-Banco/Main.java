/*A empresa NewInfo está desenvolvendo um sistema para classificar a prioridade na fila de espera de atendimento de um de seus clientes. 


Atendendo ao Estatuto, escreva um programa que solicite a idade do usuário a ser atendido a fim de encaminhá-lo para a fila comum, se a idade for menor que 60 anos, para a fila prioritária, se a idade tiver 60 anos ou mais e para a “fila 80+”, se a idade for maior que 80 anos. Apresente a resposta em fluxograma e linguagem de programação Java.*/
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class SistemaDeFila {
  public static void main(String[] args) {
    int idade;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira sua idade para ser direcionado a fila:");
    idade = leitor.nextInt();
   

   if(idade < 60){
      System.out.println("Se encaminhe para fila comum");
    } else if(idade >= 60 && idade < 80){
      System.out.println("Se encaminhe para fila comum");
    }else if(idade >= 80){
      System.out.println("Se encaminhe para fila  80+");
    }else{
      System.out.println("Digite um valor inteiro válido");
      } 
  }
}