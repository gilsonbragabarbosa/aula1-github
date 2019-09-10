
package javaprogram;
import java.util.Scanner;


public class NumeroPrimo {
 public static void main(String[]args){
     Scanner input = new Scanner(System.in);
     
     int cont=0;
     System.out.println("Insira um numero inteiro e direi se é primo,par,ou impar");
     int num = input.nextInt();
     
     for(int i=1;num>=i;i++)
     {
         
         if(num%i==0)
             cont++;
         
     }
     if(cont==2)
         System.out.println("Numero primo");
   
     if(num%2==0)
         System.out.println("Numero par");
     else
     if(num%2==1 && cont!=2)
         System.out.println("Numero impar");
         
         
    
 }   
}
