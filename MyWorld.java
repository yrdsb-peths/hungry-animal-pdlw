import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world is where the Elephant lives.
 * 
 * @author Micah Waddell 
 * @version v1.0
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
        super(600, 400, 1);
        Elephant elephant = new Elephant();
        Apple apple = new Apple();
        addObject(elephant, 300,200);
        addObject(apple, 300,0);
    }
}
