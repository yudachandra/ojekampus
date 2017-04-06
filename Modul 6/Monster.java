/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Entity
{
    public Monster(String name, int level)
    {
        super(name, level);
    }

    public void quote()
    {
        System.out.println("I'll kill them!!");
    }
    
    public void fullHP()
    {
        maxHP=level^2/10+5;
        strength=level^2/10+5;
        setPower();
    }
}