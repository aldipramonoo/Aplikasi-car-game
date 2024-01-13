import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Pendukung
{
     int speed = 3;
    public void act()
    {
        Coin a = new Coin();
        Actor i = getOneIntersectingObject(Coin.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
