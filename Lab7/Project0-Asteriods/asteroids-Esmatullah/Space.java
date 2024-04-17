import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


/**
 * Space. Something for rockets to fly in...
 * 
 * @author Michael Kölling
 * @version 2.0
 */
public class Space extends World
{
    /**
     * Create the space world with black background and stars.
     */
    public Space() 
    {
        super(800, 600, 1);
        GreenfootImage background = getBackground();
        background.setColor( Color.BLACK);
        background.fill();
        createStars(300);
        Explosion.initialiseImages();
        prepare();
    }

    /**
     * Create some random stars in the world
     */
    private void createStars(int number) 
    {
        GreenfootImage background = getBackground();             
        for (int i=0; i < number; i++) {            
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            int color = 150 - Greenfoot.getRandomNumber(120);
            background.setColorAt(x, y, new Color(color,color,color));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,41,552);
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,102,155);
        asteroid.setLocation(233,194);
        Asteroid asteroid2 = new Asteroid();
        addObject(asteroid2,233,194);
        asteroid.setLocation(308,144);
        Asteroid asteroid3 = new Asteroid();
        addObject(asteroid3,345,270);
        Asteroid asteroid4 = new Asteroid();
        addObject(asteroid4,265,282);
        Asteroid asteroid5 = new Asteroid();
        addObject(asteroid5,402,197);
        Rocket rocket2 = new Rocket();
        addObject(rocket2,47,435);
        Rocket rocket3 = new Rocket();
        addObject(rocket3,28,308);
        Rocket rocket4 = new Rocket();
        addObject(rocket4,30,93);
        Rocket rocket5 = new Rocket();
        addObject(rocket5,25,197);
    }
}