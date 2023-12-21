import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GOMI2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GOMI2 extends Actor
{
    /**
     * Act - do whatever the GOMI2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getImage().scale( 50, 50 );
        move(2);
        
        Actor UFOAP = getOneIntersectingObject(UFOAP.class);
        if(UFOAP != null){
            getWorld().removeObject( UFOAP );
            getWorld().removeObject( this );
        }
    }    
}
