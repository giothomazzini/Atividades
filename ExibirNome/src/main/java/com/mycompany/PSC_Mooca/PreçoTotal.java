package com.mycompany.PSC_Mooca;

import static java.lang.System.in;
import java.util.Scanner;
public class PreçoTotal {

    public static void main(String[] args) {
        double preco, total = 0;
        int codigo;
        Scanner leitor = new Scanner(in);
        System.out.println("Digite cod ou dif  p/sair");
        codigo = leitor.nextInt();
        while(codigo != 0){
            System.out.println("Digite o preço:");
            preco = leitor.nextDouble();
            System.out.println("Digite cod ou dif 0 p/sair");
            codigo = leitor.nextInt();
            
        }
        System.out.println("O total foi de R$" +total);
    }
    
}
