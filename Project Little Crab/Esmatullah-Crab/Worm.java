import greenfoot.*; 

public class Worm extends Actor
{
    public void act() 
    {
        move(3); // Move the worm forward
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(90) - 45); // Randomly turn the worm
        }
        if (isAtEdge()) {
            turn(180); // Turn the worm around if it's at the edge of the world
        }
    }    
}
