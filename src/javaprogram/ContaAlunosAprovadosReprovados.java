
package javaprogram;
import java.util.Scanner;

public class ContaAlunosAprovadosReprovados {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int aprova=0;
        int reprova=0;
        int contanota=1;
       
        
        while(contanota<=5){
            contanota++;
            
            System.out.println("Insira 1-para aprovado , 2-para reprovado");
            int nota=input.nextInt();
            if(nota==1)
                aprova++;
            else
            if(nota==2)
                    reprova++;
            else
            System.out.println("Insira uma nota valida");
            
        }
        System.out.println("Alunos aprovados ,"+aprova);
        System.out.println("Alunos rteprovados ,"+reprova);
        
        if(aprova>2)
            System.out.println("Parabes");
    else
            System.out.println("Que pena");
    
}
}
