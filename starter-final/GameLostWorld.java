// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameLostWorld extends World
{

    /**
     * Constructor for objects of class GameLostWorld.
     */
    public GameLostWorld()
    {
        super(800, 600, 1);
        showTextWithBigRedFont("Game Over!", 265, 300);
    }

    /**
     * This method is what makes it possible to show the "you lost" message
     */
    public void showTextWithBigRedFont(String messages, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(messages, x, y);
    }
}
