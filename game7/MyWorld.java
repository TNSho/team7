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
<<<<<<< HEAD
        
        super(650, 400, 1);
        
        addObject( new SOUJIKI(), 10, 20);
        addObject( new GOMI(), 820, 430);
        addObject( new UFOAP(), 400, 20);
        
        
        
        
        
         
        
=======
        super(650, 400, 1); 
        addObject(new SOUJIKI(), 100,200);
>>>>>>> 049bb519c4b501c4f59eee0f4b145e8b6918064c
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
