import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    String login, senha;

  login = JOptionPane.showInputDialog("Entre com o Login"); senha = JOptionPane.showInputDialog("Entre com a senha"); 

  if( login.equals("aluno") && senha.equals("aluno")) { 
   JOptionPane.showMessageDialog(null, "Acesso liberado"); 
  }else { 
     JOptionPane.showMessageDialog(null, "Login ou senha incorretos"); 
     }  
  }
}