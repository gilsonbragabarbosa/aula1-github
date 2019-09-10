/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class WhileContaNotaSentinela {
    public static void main(String[]args){
        
        
     double total=1;
        int sair=0;
        int contanota=-1;
        double nota=0;
        Scanner input = new Scanner(System.in);
        
        
        while(nota!=-1)
        {
           contanota++;
            System.out.println("Insira a proxima nota , ou digite -1 para sair");
            nota=input.nextDouble();
            total+=nota;
    }
        if(total==0){
            System.out.println("Insira pelo menos um anota");
        }else{
        System.out.println("Total de notas :"+total);
        double media = total/contanota;
        System.out.println("Media final :"+media);
    }
    }
}


