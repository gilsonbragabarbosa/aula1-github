
package javaprogram;

import java.util.Scanner;

public class Estrelinhas {
    public static void main(String[]args){
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a quantidade :");
        int n = ler.nextInt();
        int m = ler.nextInt();
        
        
        int[][]vet = new int[n][m];
        
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                vet[i][j]=ler.nextInt();
            }
          
        }
        
        System.out.println("A matriz ficou");
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(vet[i][j]+" ");
            }
            System.out.println();
    }
    }
}