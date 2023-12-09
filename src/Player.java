
public class Player {
    
   private int bank, round, dicesum,roundmem,x;
   private String name;
   private PairOfDice dice = new PairOfDice();
    
    public Player(String n) {
        bank = 0;
        round = 0;
        name = n;

    }
    
    public void Turn(){
        dice.roll();
        roundmem = round;
        dicesum = dice.getSum();
        System.out.println("");
        System.out.println(dice.toString());
        
        
        
        round = dice.getSum();
        if(dice.isSnakeEyes()){
            System.out.println("Unlucky! Bank wipped!");
            bank = 0;
            round =0;
            dicesum =0;
            roundmem=0;
        }
        else if (dice.hasOne()){
            System.out.println("Ouch, round points wipped.");
            round = 0;
            dicesum = 0;
            
        }
        x = dicesum + roundmem;
        System.out.println(name+ "'s dice: " + dicesum);
        System.out.println(name + "s wallet: " + x);

        round = roundmem + dicesum;
        
    }
    public int GetBank(){
        return bank;
    }
    public boolean winner(){
        if (bank >= 100)
            return true;
       return false;
    }
    public String getName(){
        return name;
    }
    public int DiceSum(){
        return dicesum;
    }
    
    public int KeepRound(){
        return round;
    }
    
    public void BankAmount(){
        bank =  round;
        
        System.out.println("");
        System.out.println(name + " Round points deposited.");
        x=0;
        roundmem = 0;
    }
    public int GetRound(){
        return round;
    }

}
