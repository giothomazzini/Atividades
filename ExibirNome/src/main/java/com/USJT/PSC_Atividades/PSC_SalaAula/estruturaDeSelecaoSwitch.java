
package com.USJT.PSC_Atividades.PSC_SalaAula;


public class estruturaDeSelecaoSwitch {
    public static void main(String[] args) {
        
        int nota = 70;
        
        switch(nota){
            case 70: 
                System.out.println("Aluno aprovado com o conceito C");
                break;
            case 80: 
                System.out.println("Aluno aprovado com o conceito B");
                break;
            case 90: 
                System.out.println("Aluno aprovado com o conceito A");
                break; 
            default:
                System.out.println("Aluno reprovado");

        }
    }
    
}
