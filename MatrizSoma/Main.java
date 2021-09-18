class Main {
  public static void main(String[] args) {
    int soma=0;
    int linha, coluna;

    int matriz[][] = { //matriz 10x10
      {1,2,3,4,5,6,7,8,9,10},
      {1,2,3,4,5,6,7,8,9,10},
      {1,2,3,4,5,6,7,8,9,10}, 
      {1,2,3,4,5,6,7,8,9,10}, 
      {1,2,3,4,5,6,7,8,9,10}, 
      {1,2,3,4,5,6,7,8,9,10}, 
      {1,2,3,4,5,6,7,8,9,10},
      {1,2,3,4,5,6,7,8,9,10}, 
      {1,2,3,4,5,6,7,8,9,10}, 
      {1,2,3,4,5,6,7,8,9,10} };

    for(linha=0; linha < 10; linha++){
      for( coluna = 0; coluna < 10; coluna++){
        soma += matriz[linha][coluna];
      }
    }
    System.out.println("Soma das entradas da matriz é: " + soma);
  }
}