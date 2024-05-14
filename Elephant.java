import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant actor, the main hero in this game.
 * 
 * @author Micah Waddell 
 * @version v1.0
 */
public class Elephant extends Actor
{
    GreenfootSound pointSound = new GreenfootSound("pointSound.mp3");
    
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            pointSound.play();
        }
    }
}
