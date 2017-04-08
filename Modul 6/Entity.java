
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
    protected boolean dead=false;
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
        health-=diff;
        if (health<=0)
        {
             dead = true;
        }
    }
    protected double getDamage (double def, double opRank)
    {
        double damage ;
        damage = (1+(((((2*level)/5)+2)*rank.getAttackPower()*(attack/def))/50))
        *opRank*rank.getRank();
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
        return level;
    }
    protected int getHp()
    {
        return health;
    }
    protected boolean isDead()
    {
        return dead;
    }
    protected void setRank (Rank rank)
    {
        this.rank=rank;
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
        armor = name;
        armorDef = def;
        setPower();
    }
    public String getArmor()
    {
        return armor;
    }
    public double getArmorDef()
    {
        return armorDef;
    }
    protected void fullHP()
    {
    }
    protected void quote()
    {
    }
}
