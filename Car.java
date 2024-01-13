import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Car extends Actor
{
    int score = 0;
    public void act()
    {
        checkKey();
        end();
        getWorld().showText("Score : " + score, 70, 30); 
        addScore();
    }
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+5);
        }

        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5, getY());
        }

        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5, getY());
        }

    }
    
    public void end(){
        if (isTouching(Car2.class)||isTouching(Car3.class)){
            getWorld().showText("Game Over \n Score : " + score, 200,300);
            Greenfoot.stop();
    
        }
    }
    
    public void addScore(){
        if (isTouching(Coin.class)){
            score = score + 50;
            removeTouching(Coin.class);
        }
    }
}
