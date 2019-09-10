
package entidades;

/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/

public class Funcionario {
    
    public String nome;
    public double salario;
    public double imposto;
    
    public void aumentaSal(double porcentagem){
        this.salario+=salario*porcentagem/100;
        
    }
    public double salarioAtual(){
        return this.salario - imposto;
        
    }
    
    @Override
    public String toString(){
        return "Salario "+nome+","+salarioAtual();
    }
}
