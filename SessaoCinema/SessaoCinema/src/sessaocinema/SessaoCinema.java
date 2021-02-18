package sessaocinema;

import java.util.Scanner;

public class SessaoCinema {
         
   public static void main(String[] args) {
          
        System.out.println("Bem-vindo ao Sessão Cinema");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|[01]- Interestellar - [Sala 03] - [19h]");
        System.out.println("|[02]- O Senhor dos anéis - [Sala 01] - [19h]");
        System.out.println("|[03]- Star Wars - [Sala 02] - [21h]");
        System.out.println("|[04]- 3 homens em conflito - [Sala 01] - [22h]");
        System.out.println("|[05]- De volta para o futuro - [Sala 02] - [23h]");
        System.out.println("|[06]- O Senhor dos anéis - [Sala 03] - [21h30]");
        System.out.println("|[07]- Star Wars - [Sala 01] - [00h30]");
        System.out.println("|[08]- Desistir! Não assistirei filme hoje!");
        System.out.println("+-----------------------------------------------+");
        
        Scanner tc = new Scanner(System.in);
        int sessao = tc.nextInt();
        switch(sessao){
            case 1:
                System.out.println("[01]- Interestellar - [Sala 03] - [19h]");
                System.out.println("Sessão Escolhida!");
                break;
            case 2:
                System.out.println("[02]- O Senhor dos anéis - [Sala 01] - [19h]");
                System.out.println("Sessão Escolhida!");
                break;
            case 3:
                System.out.println("[03]- Star Wars - [Sala 02] - [21h]");
                System.out.println("Sessão Escolhida!");
                break;
            case 4:
                System.out.println("[04]- 3 homens em conflito - [Sala 01] - [22h]");
                System.out.println("Sessão Escolhida!");
                break;
            case 5:
                System.out.println("[05]- De volta para o futuro - [Sala 02] - [23h]");
                System.out.println("Sessão Escolhida!");
                break;
            case 6:
                System.out.println("[06]- O Senhor dos anéis - [Sala 03] - [21h30]");
                System.out.println("Sessão Escolhida!");
            case 7:
                System.out.println("[07]- Star Wars - [Sala 01] - [00h30]");
                System.out.println("Sessão Escolhida!");
            default:
                System.out.println("Desistir! Não assistirei filme hoje!");                
        }
        
        int cadeira [] = new int[20];
        
            for(int i = 0; i < 20; i++){
                if(cadeira[i] == 0){
                    System.out.println("[cadeira]"+ i);
                } else{
                    System.out.println("[----]");
                }
            }
       
        
        System.out.println("Reserve a cadeira");
        int cad = tc.nextInt();
        
        if(cadeira[cad] == 0){
            System.out.println("Cadeira " + cad + " Reseverda!");
        } else{
            System.out.println("Erro: Lugar Ocupado!");
        }     
    }
}
