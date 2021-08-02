package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author jeremias.posso
 */
public class TestaAluno {
    
    public static void main(String[] args) {
      Aluno aluno = new Aluno();
     
      aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
      aluno.setSobrenome(JOptionPane.showInputDialog("Digite o sobrenome do aluno"));
      aluno.setIdade(JOptionPane.showInputDialog("Digite a idade do aluno"));
      aluno.setTelefone(JOptionPane.showInputDialog("Digite o telefone do aluno"));
      aluno.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario")));
        System.out.println("Nome: " + aluno.getNome());
      
      
//      aluno.sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome");
//      aluno.idade = JOptionPane.showInputDialog("Digite sua idade");
//     aluno.salario = Float.parseFloat(JOptionPane.
//                                         showInputDialog("Digite seu salario"));
//      
//     aluno.cpf = Long.parseLong(JOptionPane.
//                                         showInputDialog("Digite seu cpf"));
//      
//     
//     JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome 
//              + " " + aluno.sobrenome + "\nIdade: " + aluno.idade 
//              + "\nSalario: " + aluno.salario + "\nCpf: " + aluno.cpf);
//      
    }
          
}
