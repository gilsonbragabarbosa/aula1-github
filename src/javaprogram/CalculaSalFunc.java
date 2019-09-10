
package javaprogram;

import entidades.Funcionario;
import java.util.Scanner;

/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/

public class CalculaSalFunc {
    public static void main(String[]args){ 
         
        Funcionario func = new Funcionario();
        
        Scanner ler = new Scanner(System.in);
        System.out.print("Entre com o nome :");
        func.nome=ler.nextLine();
        System.out.print("Entre com o salario bruto :");
        func.salario=ler.nextDouble();
        System.out.print("Entre com o imposto :");
        func.imposto=ler.nextDouble();
        System.out.println(func.toString());
        System.out.print("Aumentar salario %");
        double aument=ler.nextDouble();
        func.aumentaSal(aument);
        System.out.println(func.toString());
       
        
    }
}
