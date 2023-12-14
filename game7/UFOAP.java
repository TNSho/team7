import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UFOAP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UFOAP extends Actor
{
    public void act() 
    {
        move(-1);
        if(isAtEdge()){
            for(int i=0;i<10;i++){
                int A = 0;
                int B = 800;
                int x = A + (int)(Math.random()*((B-A)+1));
                A = 0;
                B = 450;
                int y = A + (int)(Math.random()*((B-A)+1));
                
                if(x < 600){
                    x = 600;
                }
                if(y < 100 && y > 700){
                    y = 400;
                }
                setLocation(x, y);
                
            }
        }
    }    
}
