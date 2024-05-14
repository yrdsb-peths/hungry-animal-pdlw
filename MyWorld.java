import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world is where the Elephant lives.
 * 
 * @author Micah Waddell 
 * @version v1.0
 */
public class MyWorld extends World
{
    public int score;
    Label label;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 375, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, 300,325);
        createApple();
        
        label = new Label(score, 60);
        addObject(label, 40, 40);
    }
    
    //Create a new apple at random location
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 100);
    }
    
    public void increaseScore() 
    {
        score++;
        label.setValue(score);
    }
}
