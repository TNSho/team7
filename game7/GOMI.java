import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GOMI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GOMI extends Actor
{
    /**
     * Act - do whatever the GOMI wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale( 50, 50 );
        move(-2);
        if(isAtEdge()){
            for(int i=0;i<10;i++){
                int A = 0;
                int B = 800;
                int x = A + (int)(Math.random()*((B-A)+1));
                A = 0;
                B = 450;
                int y = A + (int)(Math.random()*((B-A)+1));
                
                if(x < 600)
                {
                    x = 600;
                }
                setLocation(x, y);
                
            }
        }

    }    
}
