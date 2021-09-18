import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    //variaveis
    String produto;
    double valor;
    int i;

    for(i=0;i < 10;i++) {
      produto = JOptionPane.showInputDialog("Informe o nome do Produto: ");
      valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o nome valor do Produto: "));
      valor = valor - (0.5 * valor) ;
      JOptionPane.showMessageDialog(null, "O produto: " + produto + " está com 50% de desconto saindo a " + valor );

    }
  }
}