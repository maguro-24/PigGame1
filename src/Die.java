

public class Die {
    
    private int face;
    private int side;
    
    public Die()
    {
        side = 6;
        roll();
    }
    
    //overloaded constructor
    public Die(int s) //formal parameter
    {
        side = s; //local var.
        roll();
    }
    
    public void roll()
    {
        face = (int)(Math.random()*side+1);
    }
    
    // accessoers "GET" out instance data
    
    public int getSide()
    {
        return side;
    }
    
    public int getFace()
    {
        return face;
    }
    
    //mutators "SET" the instance data
    
    public void setSide(int s)
    {
        side = s;
    }
    
    public void setFace(int f)
    {
        face = f;
    }
    
    public String toString()
    {
       return "" + face; 
    }
 
}
