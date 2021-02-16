package sessaocinema;

import java.util.Scanner;

public class Assento {
    
    int poltrona [][] = new int [10][5];
    
    
    public static void lugares(int poltrona[][]){
        
        for(int i=0; i<=10; i++){
            for(int j=0; j<=5; j++){
               poltrona[i][j]= 0; 
                
            }
        }
    }
    
    public static void escolherLugar(int poltrona[][]){
        
        int pol = 1;
        while(pol != 0){
            
            Scanner teclado = new Scanner(System.in);
            System.out.println("Informe a fila desejada: ");
            int i = teclado.nextInt();
            System.out.println("Informe a poltrona desejada: ");
            int j = teclado.nextInt();
            
            if (poltrona[i][j]==0){
                poltrona[i][j]=1;
                System.out.println("Poltrona Reservada!");
            }
            else{
                System.out.println("Poltrona Ocupada!");
            }
        }
    }
    
}
