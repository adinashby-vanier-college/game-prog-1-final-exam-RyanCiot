// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        onLocation();
        if (isGameWon()) {
            transitionToGameWonWorld();
            Greenfoot.playSound("win.wav");
        }
    }

    /**
     * let's the ladybug move and turn
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
    }

    /**
     * checks if the ladybug interacts with the FinishLocation actor
     */
    public void onLocation()
    {
        Actor finishLocation = getOneIntersectingObject(FinishLocation.class);
        if (finishLocation != null) {
            World world = getWorld();
            world.removeObject(finishLocation);
        }
    }

    /**
     * This method checks to see if the win condition is met
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions from myWorld to gameWonWorld
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }
}
