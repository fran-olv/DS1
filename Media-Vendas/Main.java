import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    float[] vendas = new float[1000];
    
    float venda, media, total;
    Scanner leitor = new Scanner(System.in);

    total = 0;
    for(int i=0; i<1000; i++){
      System.out.println("Cadastre o valor vendido na venda de numero " + i);
      //vendas[i] = i; >> a fim de teste para verificar a media de forma mais rapida
      vendas[i] = leitor.nextInt();
      total = total + vendas[i];
    }

    media = total/1000;
    System.out.print("Media de vendas: R$" + media);
    


  }
}