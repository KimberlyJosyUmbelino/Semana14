import javax.swing.*;
import java.util.*;
import javax.swing.table.*;
public class TelaTabela{

   public static void main(String []args){
      String[] colunas={"nome","idade","sexo","endereco","vegetariano(a)","esporte"};
      ArrayList<Pessoa> pessoas;

      PessoaFactory y= new PessoaFactory();

      pessoas=y.completaTabela();

      TableModel table = new Tabela(pessoas,colunas);

      JTable tabela= new JTable(table);
      JScrollPane rolagem= new JScrollPane(tabela);
      JFrame quadro= new JFrame(); 
      quadro.getContentPane().add(rolagem);
      quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      quadro.setLocationRelativeTo(null);
      quadro.pack();
      quadro.setVisible(true);
   }
}