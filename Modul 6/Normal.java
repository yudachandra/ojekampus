
/**
 * Write a description of class Normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normal
{
    // instance variables - replace the example below with your own
    private String attackName;
    private int attackPower;
    private static double rank=1;
    
    public Normal(String name, int power)
    {
        this.attackName = name;
        this.attackPower = power;
    }

    public void setAttackName(String name)
    {
        this.attackName = name;
    }
    
    public String getAttackName()
    {
        return attackName;
    }
    
    public void setAttackPower(int power)
    {
        this.attackPower = power;
    }
    
    public int getAttackPower()
    {
        return attackPower;
    }
    
    public double getRank()
    {
        return rank;
    }
    
}
