package javaprogram;
import java.util.Scanner;

class Conta{
    private String nome;
    private double saldo;
    
 


Conta(String nome, double saldo){
this.nome=nome;
this.saldo=saldo;
}

public void setNome(String nome){
    this.nome=nome;
}
public String getNome(){
    return nome;
}
public void setSaldo(double saldo){
    this.saldo=saldo;
}
public double getSaldo(){
    return saldo;
}
boolean deposita(double valor){
    if(valor<0.0){
        System.out.println("Valor incorreto");
      return false;
    }else{
    this.saldo=saldo+valor;
    System.out.println("Operaçao realizada com sucesso");
    return true;
}}
void saca(double valor){
    this.saldo=saldo-valor;
}
boolean transferepara(Conta destino,double valor){
    if(valor>this.saldo || valor<=0.0){
        System.out.println("Operaçao invalida,Altere o valor esta maaior que o saldo!");
        return false;
    }else{
    this.saldo=saldo-valor;
    destino.saldo=destino.saldo+valor;
        System.out.println("Opereacao realizada");
        return true;
}
}
}
    public class JavaProgram{
        public static void main(String[]args){
            
         
          Conta c1 = new Conta("joao",200);
          Conta c2 = new Conta("sdf",100);
          
        c1.transferepara(c2,200);
            System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
          
          
    }
    
}
