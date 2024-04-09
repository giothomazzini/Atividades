
package diariodenotas;

import javax.swing.JOptionPane;


public class DiarioDeNotas {
    public static void main(String[] args) {
        
        String usuario = JOptionPane.showInputDialog("Digite (1) para aluno e (2) para professor");
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        
        if(usuario.equalsIgnoreCase("1")){
            JOptionPane.showMessageDialog(null, "Bem vindo aluno(a), "+nome);
            
         }else if(usuario.equalsIgnoreCase("2")){
            JOptionPane.showMessageDialog(null, "Bem vindo professor(a), "+nome);
            
            String UC = JOptionPane.showInputDialog("Digite a UC");
            String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            int a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A1: "));
            int a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A2: "));
            int a3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A3: "));
            
            double media;
            media = (a1+a2+a3)/3;
            JOptionPane.showMessageDialog(null, "A média final do aluno(a), " +nomeAluno +" é de: " +media);
                
            }else{ 
                JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
        
        
    }    
}

