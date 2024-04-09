
package com.USJT.PSC_Atividades;

import javax.swing.JOptionPane;

public class VerificaTriangulo {
    public static void main(String[] args) {
        double lado1;
        double lado2;
        double lado3;
        
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1 do triângulo: "));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2 do triângulo: "));
        lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 3 do triângulo: "));
        
        if(lado1 == lado2 && lado3 == lado2) {
            JOptionPane.showMessageDialog(null, "O triângulo é equilátero");
        } else {
            if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
                JOptionPane.showMessageDialog(null, "O triangulo é escaleni");
            } else {
                JOptionPane.showMessageDialog(null, "O triangulo é isóceles");
            }
        }
        
        
       
    }
    
}
