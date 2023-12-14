import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
     
        super(650, 400, 1);
        
        addObject( new SOUJIKI(), 100, 200);
        for(int i=0;i<1;i++){
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
            addObject(new UFOAP(), x, y);
            
        }
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
            addObject(new GOMI(), x, y);
            
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void Actor()
    {
    }
}
