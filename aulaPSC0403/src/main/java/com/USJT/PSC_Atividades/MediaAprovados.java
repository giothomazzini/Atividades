package com.USJT.PSC_Atividades;

import javax.swing.JOptionPane;

public class MediaAprovados {
    public static void main(String[] args) {
    int notaFinal;
    
    int a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A1: "));
    int a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A2: "));
    int a3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A3: "));
    
    notaFinal = (a1*3+a2*3+a3*4)/10;
    JOptionPane.showMessageDialog(null, "Nota Final: " +notaFinal);
    
    if(notaFinal >= 70){
        JOptionPane.showMessageDialog(null, "Aprovado! :)");
        System.out.println("Aprovado!");
    }
    if(notaFinal >= 30 && notaFinal < 70) {
        JOptionPane.showMessageDialog(null, "AI :|");
        System.out.println("AI"); 
    }
    if(notaFinal < 30){
        JOptionPane.showMessageDialog(null, "Reprovado! :(");
        System.out.println("Reprovado!");
    }
    
    
    }
    
}
