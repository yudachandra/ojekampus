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
        System.out.println("War start!"+"\nHero = "+player.getName()+", level = "+player.getLevel() +"\nEnemy = "+enemy.getName()+", level = "+player.getLevel());   
        
         for (int i = 1; !player.isDead(); i++) 
         {
             print(i);                  
             // kode anda                          
             if (enemy.isDead())
             {
                  System.out.println("Enemy died! Spawning new enemy!"); 
                  // kode anda
                  System.out.println("Player level up! Level = " + player.getLevel()); 
             }
         }
         
        System.out.println("Hero mati pada level " + player.getLevel());  
    }
    
    private void initialize()
    {
    
    }
    
    private void initializeEnemy()
    {
    
    }
    
    private void print(int i)
    {
        System.out.println("\nRound = " + i + 
        "\nKill count = " + (enemyCount - 1) +     
        "\nHero health = " + player.getHP() + ", Enemy health = " + enemy.getHP());          
        // kode anda
    }
    
    private Rank setRank(String name, int Power)
    {
        return null;
    }
    
    private void attackTurn(Entity attacker, Entity defender){
    
    }
    
    public void main(String[] args){
    
    }
   
}