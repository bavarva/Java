import java.util.Random;
import java.util.Scanner;
public class rockpaperscissors {
    
        public static void main(String[] args) {
            
            int c=0;
            int p=0;
        for(int i=0; i<5; i++){
        Scanner sc=new Scanner(System.in);
        String[] game={"rock","paper","scissors"};
        String comp=game[new Random().nextInt(game.length)];
        
        System.out.println("ENTER 1 to select ROCK\nENTER 2 to select PAPER\nENTER 3 to select SCISSORS");
        String playermove;
        int select = sc.nextInt();
        switch (select) {
            case 1:
               playermove = "ROCK";
            break;
            case 2:
               playermove = "PAPER";
            break;
            case 3:
               playermove = "SCISSORS";
            default:
               System.out.println("Invalid");
            break;
        }

        if(select==1 &&comp.equals("paper")){
            System.out.println("Player: ROCK");
            System.out.println("Computer: PAPER");
            System.out.println("WINNER: COMPUTER");
            c++ ;
        }
        else if(select==1 &&comp.equals("scissors")){
            System.out.println("Player: ROCK");
            System.out.println("Computer: SCISSORS");
            System.out.println("WINNER: PLAYER");
            p++ ;
        }
        else if(select==1 &&comp.equals("rock")){
            System.out.println("Player: ROCK");
            System.out.println("Computer: ROCK");
            System.out.println("NO WINNER");
        }
        else if(select==2 &&comp.equals("scissors")){
            System.out.println("Player: PAPER");
            System.out.println("Computer: SCISSORS");
            System.out.println("WINNER: COMPUTER");
            c++ ;
        }
        else if(select==2 &&comp.equals("rock")){
            System.out.println("Player: PAPER");
            System.out.println("Computer: ROCK");
            System.out.println("WINNER: PLAYER");
            p++ ;
        }
        else if(select==2 &&comp.equals("paper")){
            System.out.println("Player: PAPER");
            System.out.println("Computer: PAPER");
            System.out.println("NO WINNER");  
        }
        else if(select==3 &&comp.equals("scissors")){
            System.out.println("Player: SCISSORS");
            System.out.println("Computer: SCISSORS");
            System.out.println("NO WINNER");
        }
        else if(select==3 &&comp.equals("paper")){
            System.out.println("Player: SCISSORS");
            System.out.println("Computer: PAPER");
            System.out.println("WINNER: PLAYER");
            p++ ;
        }
        else if(select==3 &&comp.equals("rock")){
            System.out.println("Player: SCISSORS");
            System.out.println("Computer: ROCK");
            System.out.println("WINNER: COMPUTER");
            c++ ;
        }
        else{
            System.out.println("Please Try Again!");
        }

        System.out.printf("\n\nPOINTS TABLE\n\nPLAYER = %d\nCOMPUTER = %d\n\n\n",p,c);
    }
    
        if(p>c){
            System.out.println("PLAYER WINS THE SERIES!!!!");
        }
        else if(c>p){
            System.out.println("COMPUTER WINS!");
        }
        else if(p==c){
            System.out.println("SERIES TIED");
        }
        else{
            System.out.println("Sorry! ERROR DETECTED");
        }
 }
}
    
