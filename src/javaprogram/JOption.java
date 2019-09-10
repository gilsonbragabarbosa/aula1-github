
package javaprogram;


class Lampada_1{
   
    boolean status = true; 
    
    public void acender(){
 
        this.status = true;
              
}
    public void apagar(){
        this.status = false;
    }
    
    public void situacao(){
        if(status == false)
            System.out.println("Lampada apagda!");
        else
        
            System.out.println("Lampada acesa!");
    
}

}

public class JOption {
    public static void main(String[]args){
        
        Lampada_1 lam = new Lampada_1();
        lam.apagar();
        lam.situacao();
        
    }
}
