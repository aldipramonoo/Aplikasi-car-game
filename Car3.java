import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Car3 extends Pendukung
{
     int speed = 1;
    public void act()
    {
        Car3 a = new Car3();
        Actor i = getOneIntersectingObject(Car3.class);
        move(speed);
        checkdouble(i);
        end();
    }
    
}
