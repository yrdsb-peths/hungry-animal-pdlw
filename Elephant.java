import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;
import java.util.TimerTask;
/**
 * The Elephant actor, the main hero in this game.
 * 
 * @author Micah Waddell 
 * @version v1.0
 */
public class Elephant extends Actor
{
    GreenfootSound pointSound = new GreenfootSound("pointSound.mp3");
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    GreenfootImage[] idleRight = new GreenfootImage[8];
    String facing = "right";
    Timer timer = new Timer();
    public Elephant()
    {
        for(int i = 0; i<8; i++)
        {
            idleRight[i] = new GreenfootImage("idle" + i + ".png");
            idleRight[i].scale(100,100);
        }
        for(int i = 0; i<8; i++)
        {
            idleLeft[i] = new GreenfootImage("idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100,100);
        }
        setImage(idleRight[0]);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            facing = "right";
        }
        eat();
        animateElephant();
    }
    int imageIndex = 0;
    public void animateElephant()
    {
        if(facing.equals("right"))
        {
        setImage(idleRight[imageIndex]);
        imageIndex = (imageIndex+1) % idleRight.length;
        }
        else
        {
        setImage(idleLeft[imageIndex]);
        imageIndex = (imageIndex+1) % idleLeft.length;
        }
    }
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            pointSound.play();
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
    }
}
