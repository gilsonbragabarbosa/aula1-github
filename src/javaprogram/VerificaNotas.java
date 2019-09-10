
package javaprogram;
import java.util.Scanner;

class Aluno{
    private String nome;
    private double media;
    
   public Aluno(String nome,double media){
        this.nome=nome;
        if(media>0.0 && media<=100)
            this.media=media;
       
        }
        public void setNome(String nome){
            this.nome=nome;
    }
        public String getNome(){
            return nome;
        }
        public void setMedia(double media){
            if(media>0.0 && media<=100)
            this.media=media;
        }
        public double getMedia(){
            return media;
        }
        public String retornaLetra(){
            
            String letra="";
            
            if(media>=90)
            letra="A";
        else
        if(media>=80)
            letra="B";
        else
        if(media>=70)
            letra="C";
        else
        if(media>=60)
            letra="D";
       
            else
            letra="F";
            
            return letra;
            
        }
}
public class VerificaNotas {
    public static void main(String[]args){
        
       Scanner input = new Scanner(System.in);
       
       Aluno al =new Aluno("Rafael",90);
        System.out.println(al.getNome()+" "+al.retornaLetra());
        
    }
    
}
