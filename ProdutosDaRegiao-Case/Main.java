import java.util.Scanner;


class Main {

  public static void main(String[] args) {
    int codigo;

    Scanner leitor = new Scanner(System.in);


    System.out.println("Entre com o codigo da Região do produto:");
    codigo = leitor.nextInt();

    switch(codigo){
      case(1): 
        System.out.println("Codigo referente a região: Sul");
        break;
      case(2):
        System.out.println("Codigo referente a região: Norte");
        break;
      case(3):
        System.out.println("Codigo referente a região: Leste");
        break;
      case(4):
        System.out.println("Codigo referente a região: Oeste");
        break;
      case(5):
        System.out.println("Codigo referente a região: Nordeste");
        break;
      case(6):
        System.out.println("Codigo referente a região: Sudeste");
        break;
      case(7):
        System.out.println("Codigo referente a região: Centro-Oeste");
        break;
      case(8): 
      System.out.println("Codigo referente a região: Noroeste");
      break;
      default:
      System.out.println("Codigo Não Cadastrado");
      break;
    }   

  }
}