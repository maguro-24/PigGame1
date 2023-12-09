import java.util.*;
public class PigGameDriver {
    public static void main(String[] args) {
        
        
        String x,y;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name for Player 1: ");
        x = scan.nextLine();
        System.out.println("enter name for Player 2: ");
        y = scan.nextLine();
        Game game = new Game(x,y);
       
        while(!game.isWinner()){
            System.out.println("");
            System.out.println("");
            System.out.println(x + "'s total points: " + game.xBank());
            System.out.println(y + "'s total points: " +  game.yBank());
            System.out.println("");
        System.out.println("1 to roll, 2 to end turn");
        int roll = scan.nextInt();
        if (roll == 1){
            game.Play();
        }
        else if (roll == 2){
            game.BankPoints();
        }
        }
            if (game.xBank()>game.yBank()){
                System.out.println(x + " won");
            }
            else{
                System.out.println(y + " won");
            }
           
        
    }
}
