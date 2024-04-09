package com.USJT.PSC_Atividades;

import javax.swing.JOptionPane;

public class ExibirNome {

    
    public static void main(String[] args) {
        String nome;
        double media;
        
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        System.out.println("Digite o seu nome");
        
        double nota1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua primeira nota:"));
        double nota2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua segunda nota:"));
        
        media = (nota1+nota2)/2;
        
        JOptionPane.showMessageDialog(null, nome +", sua média final é " +media);
        
    }
    }
    

