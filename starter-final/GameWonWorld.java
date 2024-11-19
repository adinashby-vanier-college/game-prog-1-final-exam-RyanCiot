// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(800, 600, 1);
        showTextWithBigBlackFont("Congratulations, You Win!", 120, 300);
    }

    /**
     * This method is what allows a message to be made
     */
    public void showTextWithBigBlackFont(String messages, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(messages, x, y);
    }
}
