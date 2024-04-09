package com.USJT.PSC_Atividades;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class notasPSC {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System .in);
       int a1, a2, a3, notaFinal;
       
        a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A1: "));
        a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A2: "));
        a3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota A3: "));
        
        JOptionPane.showMessageDialog(null, "Notas: "+a1+" "+a2+" "+a3+"");
        
        notaFinal = (a1*3+a2*3+a3*4)/10;
        JOptionPane.showMessageDialog(null, "Nota Final: "+notaFinal);
        
        if(notaFinal > 70) {
            JOptionPane.showMessageDialog(null, "Aprovado! :)");
        } else {
            if(notaFinal >= 30 && notaFinal < 70) {
                JOptionPane.showMessageDialog(null, "AI");
            } else {
                if(notaFinal < 30) {
                    JOptionPane.showMessageDialog(null, "Reprovado! :(");
                }
            }
        }
    }        
}
    