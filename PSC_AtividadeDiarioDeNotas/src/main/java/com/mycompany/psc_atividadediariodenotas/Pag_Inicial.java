
package com.mycompany.psc_atividadediariodenotas;

import javax.swing.JOptionPane;


public class Pag_Inicial {
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Digite 'Professor' se você for professor e 'Aluno' se você aluno");
        
         if(usuario.equalsIgnoreCase("Aluno")){
             Aluno aluno = new Aluno();
             aluno.identificarAluno();
             
         }else if(usuario.equalsIgnoreCase("Professor")){
             Professor professor = new Professor();
             professor.identificarProfessor();
             
         }else{
             JOptionPane.showMessageDialog(null, "Opção Inválida");
         }
        
    }
    
}
