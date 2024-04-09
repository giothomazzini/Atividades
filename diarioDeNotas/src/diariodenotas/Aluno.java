
package diariodenotas;


import javax.swing.JOptionPane;


public class Aluno {
        
        protected String nome;
        private int ra;
        private String senha;
        private String email;
        
        
        public void visualizarNota(){
            nome = JOptionPane.showInputDialog("Digite o seu nome");
            JOptionPane.showMessageDialog(null, "Bem vindo aluno(a), " +nome);
            
            double notaA1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota A1 do aluno: "));
            double notaA2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota A2 do aluno: "));
            double notaA3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota A3 do aluno: "));
            
            double notaFinal = notaA1 +notaA2+ notaA3;
            
            JOptionPane.showMessageDialog(null, "Sua nota final é " + notaFinal);
                
        }
        
        public void visualizarAtividade(){
               
        }
    
}
