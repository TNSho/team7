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
    
    private boolean flag_tama = false;
    /**
     * Act - do whatever the SOUJIKI wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale( 80, 60 );

        int x = getX();
        int y = getY();
        
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-5,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+5,y );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
           setLocation( x,y-5 );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
           setLocation( x,y+5 );
        }
        Actor gomi = getOneIntersectingObject( GOMI.class );
        if(gomi != null){
            getWorld().removeObject( gomi );
            dangan++; 
        }  
        if(dangan == 10){
            if( Greenfoot.isKeyDown( "space" ) ){
            if( flag_tama == false ){
                getWorld().addObject( new GOMI2(), getX(), getY() );
                flag_tama = true;
            }
            dangan = 0;
        }  
        else flag_tama = false;
        }
        
        Actor UFOAP = getOneIntersectingObject(UFOAP.class);
        if(UFOAP != null){
            getWorld().showText("GAME OVER", 325, 200);
            Greenfoot.stop();
        }

        
    }   
   

}
