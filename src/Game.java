
public class Game {
    
    private Player p1;
    private Player p2;
    
    private boolean winner = false;
    
    public Game(String n1, String n2) {
        p1 = new Player(n1);
        p2 = new Player(n2);
    }
    
    public boolean isWinner(){
        if (p1.winner() || p2.winner())
               return true;
        return false;
    }
    public int xBank(){
        return p1.GetBank();
    }
    public int yBank(){
        return p2.GetBank();
    }
    
   
    public void Play(){
       int x = (int)(Math.random()*10);
        p1.Turn();
           if (p2.GetRound() == 0){
               p2.Turn();   
           }
           else if ((p2.GetBank()+ p2.DiceSum()) >= 100){
               p2.BankAmount();
               
           }
            else if (yBank() > xBank() && x >=6){
            p2.Turn();}
            else if (p2.GetRound() <20 && x <=7){
                p2.Turn();
            }
            else if (p2.GetRound() > 60 && x >=2){
                p2.BankAmount();
            }
            else if (p1.GetRound() > 40 && x>=2){
                p2.Turn();
            }
            else if (x <= 9){
                p2.BankAmount();
            }
            else {
                p2.Turn();
            }
        
        
    }
    
    public void BankPoints(){
        int x = (int)(Math.random()*40);
        p1.BankAmount();
            if (p2.GetRound() == 0){
                p2.Turn();
            }
            else if (xBank() > yBank() && x > 14){
                p2.BankAmount();
            }
            else if ( x > 10 || x < 35){
                p2.Turn();
            }
            else if ( p2.GetRound() > 40 && x > 15){
                p2.BankAmount();
            }
            else if (x > 25){
                p2.Turn();
            }
            else {
                p2.BankAmount();
            }
    }
            

}
