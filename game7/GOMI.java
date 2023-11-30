import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GOMI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GOMI extends Actor
{
    private int jeda = 0;
    public int kuat = 30;
    private boolean bisaTembak = true;
    /**
     * Act - do whatever the GOMI wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void gerak()
    {
        setLocation(getX(), getY() + 1);
        if (getX() > 496)
        {
            setLocation(Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(75));
        }
    }
    public void act() 
    {
        gerak();
        if (kuat == 0)
        {
            kuat = 30;
        }
        if (jeda > 0)
            jeda--;
        if (jeda == 1 && bisaTembak)
            getWorld().addObject(new GOMI(), getX()+50, getY());
        if (jeda == 0)
            jeda = 115;
        // Add your action code here.
    }    
    public void setBisaTembak(boolean value)
    {
        bisaTembak = value;
    }
}
