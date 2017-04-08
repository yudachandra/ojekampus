import java.util.*;

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play
{
    // instance variables - replace the example below with your own
    private Hero player;
    private Monster enemy;
    private Random rand;
    private int enemyCount;

    /**
     * Constructor for objects of class Play
     */
    private Play()
    {
        // initialise instance variables
        initialize();

        System.out.println("Battle Begins!" +
        "\nHero = " + player.getName() + ", Level = " + player.getLevel() +
        "\nEnemy = " + enemy.getName() + ", Level = " + player.getLevel());

       for (int i = 1; !player.isDead(); i++)
        {
           
            print(i);
            if(i%2 == 1){
                 attackTurn(player,enemy);
            }
            else{
                attackTurn(enemy,player);
            }
            // kode anda
           
            if (enemy.isDead())
            {
                System.out.println("Enemy died! Spawning new enemy!");
                this.enemyCount = this.enemyCount+1;
                initializeEnemy();
                player.levelUp();
                // kode anda
                System.out.println("Player level up! Level = " + player.getLevel());
            }
        }
    }
    
    private void initialize()
    {
        rand = new Random();
        player = new Hero("Yuda",1);
        player.setRank(setRank("Double Strafe", 100));
        player.setWeapon("Bow", 20);
        player.setArmor("Tights", 20);
        enemyCount = 1;
        
        initializeEnemy();
    }
    
    private void initializeEnemy()
    {
        enemy = new Monster("Raydric",enemyCount);
       
        enemy.setRank(setRank("Magnum Break",60));
        enemy.setWeapon("Pedang", 20);
        enemy.setArmor("Muffler", 15);
    }
    
    private void print(int i)
    {
        System.out.println("\nRound = " + i +
        "\nKill Count = " + (enemyCount - 1) +
        "\nHero Health = " + player.getHp() + ", Enemy Health = " + enemy.getHp());
        // kode anda
        if(i%2 == 1){
            player.quote();
        }
        else{
            enemy.quote();
        }
    }
    
    private Rank setRank(String name, int power)
    {
        Rank cache = null;
        if(player.getLevel()%3 == 1)
        {
            Normal normal1 = new Normal(name, power);
            cache = normal1;
        }
        
        else if(player.getLevel()%3 == 2)
        {
             Tank tank1 = new Tank(name, power);
             cache = tank1;
        }
        else 
        {
            Damager damager1 = new Damager(name, power);
            cache = damager1;
        }
        return cache;
    }
    
    private void attackTurn(Entity attacker, Entity defender)
    {
        int damage = (int)attacker.getDamage(defender.getDefense(),defender.getRank().getRank());
        System.out.println("Damage: "+damage);
        defender.setHP(damage);
    }
    
    public static void main(String[] args)
    {
        Play demo1 = new Play();
    }
   
}