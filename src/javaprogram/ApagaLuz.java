
package javaprogram;

class Lampada{
    boolean status=true;
    
    void apaga(){
      status=false;
        }
    void acende(){
        status=true;
    }
    boolean situacao(){
        if(status==false){
            System.out.println("A lamapda está apagada!");
            return false;
        }else{
            System.out.println("Alamapda esta Acesa!");
            return true;
            
        }
    
    }
}

public class ApagaLuz {
    public static void main(String[]args){
        
        
        Lampada luz = new Lampada();
        
        luz.acende();
        luz.situacao();
      
        System.out.println("Bom dia");
        System.out.println("Boa tarde");
        System.out.println("Boa noite");
    }
}
