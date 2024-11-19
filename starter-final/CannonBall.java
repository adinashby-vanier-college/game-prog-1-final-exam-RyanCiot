// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        gotHit();
        if (isGameLost()) {
            transitionToGameLostWorld();
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * Checks if the ladybug got hit by the cannonball
     */
    public void gotHit()
    {
        Actor ladybug = getOneIntersectingObject(Ladybug.class);
        if (ladybug != null) {
            World world = getWorld();
            world.removeObject(ladybug);
        }
    }

    /**
     * Checks if the condition "isGameLost" has been satisfied
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Goes from MyWorld to GameLostWorld
     */
    public void transitionToGameLostWorld()
    {
        World gameLostWorld =  new  GameLostWorld();
        Greenfoot.setWorld(gameLostWorld);
    }
}
