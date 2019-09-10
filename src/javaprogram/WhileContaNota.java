
package javaprogram;
import java.util.Scanner;

public class WhileContaNota {
    public static void main(String[]args){
        
        double total=0;
        int conta=1;
        
        Scanner input = new Scanner(System.in);
        
        
        while(conta<=3)
        {
            conta++;
            System.out.println("Insira a nota :");
            double nota=input.nextDouble();
            total+=nota;
    }
        System.out.println("Total de notas :"+total);
        double media = total/3;
        System.out.println("Media final :"+media);
    }     
}
