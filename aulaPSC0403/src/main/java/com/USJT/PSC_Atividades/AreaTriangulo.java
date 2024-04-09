package com.USJT.PSC_Atividades;

import javax.swing.JOptionPane;

public class AreaTriangulo {
    public static void main(String[] args) {
        double altura;
        double base;
        double area;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura:"));
        
        area = (base*altura)/2;
        JOptionPane.showMessageDialog(null, "O valor da área do triângulo é " +area);
        
        
    }
    
}
