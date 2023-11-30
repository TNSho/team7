import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SOUJIKI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SOUJIKI extends Actor
{
    private int dangan;
    /**
     * Act - do whatever the SOUJIKI wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-4,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+4,y );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
           setLocation( x,y-4 );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
           setLocation( x,y+4 );
        }
        Actor gomi = getOneIntersectingObject( GOMI.class );
        Actor hune = getOneIntersectingObject( hune.class );
        if(gomi != null){
            getWorld().removeObject( gomi );
            dangan++; 
        }  
        if(dangan == 10){
        }

    }   

}
