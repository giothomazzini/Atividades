package com.mycompany.PSC_Mooca;

import javax.swing.JOptionPane;

public class VerificaPositivo {
    public static void main(String[] args) {
     int numero;
     
     numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
     
     if(numero > 0) {
         JOptionPane.showMessageDialog(null, "Positivo");
     } else {
     if(numero < 0) {
         JOptionPane.showMessageDialog(null, "Negativo");
     } else {
         if(numero >= 0 && numero <= 0) {
            JOptionPane.showMessageDialog(null, "Neutro");
         }
     }
     
    }
    }
}
