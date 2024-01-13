import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
        
    }
    
    private void prepare(){
        Car car = new Car();
        addObject(car, 159, 545);
    }
    
    public void act(){
       if (Greenfoot.getRandomNumber(100)<1){
           addObject(new Car2(), Greenfoot.getRandomNumber(200) + 30, 0);  
       }
       
          if (Greenfoot.getRandomNumber(200)<1){
           addObject(new Car3(), Greenfoot.getRandomNumber(200) + 30, 0);  
       }
       
           if (Greenfoot.getRandomNumber(200)<1){
           addObject(new Coin(), Greenfoot.getRandomNumber(200) + 30, 0);  
       }
    }
}
