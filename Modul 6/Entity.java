
/**
 * Write a description of class Entity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Entity implements Wear
{
    protected String name;
    protected String weapon;
    protected String armor;
    protected int level;
    protected int health;
    protected int maxHP;
    protected int strength;
    protected double weaponDmg;
    protected double armorDef;
    protected double attack;
    protected double defense;
    protected double dead;
    protected Rank rank;
    
    public  Entity (String name, int level)
    {
        this.name=name;
        this.level=level;
        fullHP();
    }
    
    protected void levelUp()
    {
        level=level+1;
        fullHP();
    }
    protected void setHP (double diff)
    {
        health=health-1;
        if (health==0)
        {
            isDead();
        }
    }
    protected double getDamage (double def, double opRank)
    {
        double damage = (1+(2*level/5+2)*rank.getAttackPower()*weaponDmg/armorDef/50)*attack*defense;
        return 0;
    }
    protected void setPower()
    {
        attack = strength*(1+(weaponDmg/100));
        defense = strength*(1+(armorDef/100));
    }
    protected String getName()
    {
        this.name=name;
        return name;
    }
    protected int getLevel()
    {
        return 0;
    }
    protected int getHp()
    {
        return 0;
    }
    protected boolean isDead()
    {
        return true;
    }
    protected void setRank (Rank rank)
    {
    }
    protected Rank getRank()
    {
        this.rank=rank;
        return rank;
    }
    protected double getAttack()
    {
        return 0;
    }
    protected double getDefense()
    {
        return 0;
    }
    public void setWeapon (String name, double dmg)
    {
        this.name=name;
        this.weaponDmg=dmg;
        setPower();
    }
    public String getWeapon()
    {
        return weapon;
    }
    public void setArmor (String name, double def)
    {
    }
    public String getArmor()
    {
        return armor;
    }
    public double getArmorDef()
    {
        return 0;
    }
    protected void fullHP()
    {
    }
    protected void quote()
    {
    }
}
