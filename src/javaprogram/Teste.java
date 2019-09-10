
package javaprogram;


import java.util.Locale;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args){
       
        Scanner ler = new Scanner(System.in);
        
        int a=1;
        int total = 0;
        
        while(a!=0){
             System.out.println("Enter com um valor , -digiti  para sair-:");
             a = ler.nextInt();
            if(a<0){
                System.out.println("Insira um numero positivo");
            }else
                total+=a;
          
    }
        System.out.println("Soma total "+total);
      
    }
    
}