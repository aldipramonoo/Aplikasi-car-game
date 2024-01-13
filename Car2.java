import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Car2 extends Pendukung
{
    int speed = 3;
    public void act()
    {
        Car2 a = new Car2();
        Actor i = getOneIntersectingObject(Car2.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
