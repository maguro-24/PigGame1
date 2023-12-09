
public class PairOfDice {

    private Die die1;
    private Die die2;

    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public int getSum() {
        return die1.getFace() + die2.getFace();
    }

    public boolean isDoubles() {
        return die1.getFace() == die2.getFace();
    }

    public boolean isSnakeEyes() {
        return getSum() == 2;
    }
    public boolean isBoxCar(){
        return getSum() == 12;
    }
    public boolean hasOne(){
        return die1.getFace() == 1 || die2.getFace()==1;
    }

    public String toString() {
        return "" + die1.getFace() + " " + die2.getFace();
    }
}
