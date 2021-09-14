import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class Parkinglot extends World
{
    private GreenfootSound sound = new GreenfootSound("fly-noise.mp3");
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public Parkinglot() 
    {
        super(560, 560, 1);
        playLoop();
        prepare();
  
    }
    public void playLoop()
    {
        Greenfoot.playSound("fly-noise.mp3");
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Car car = new Car();
        addObject(car,49,247);
        ParkedCar parkedCar = new ParkedCar();
        addObject(parkedCar,55,362);
        ParkedCar parkedCar2 = new ParkedCar();
        addObject(parkedCar2,512,252);
        ParkedCar parkedCar3 = new ParkedCar();
        addObject(parkedCar3,329,39);
        Cupcake cupcake = new Cupcake();
        addObject(cupcake,485,75);
        Cupcake cupcake2 = new Cupcake();
        addObject(cupcake2,376,139);
        Cupcake cupcake3 = new Cupcake();
        addObject(cupcake3,85,58);
        Cupcake cupcake4 = new Cupcake();
        addObject(cupcake4,514,500);
        Cupcake cupcake5 = new Cupcake();
        addObject(cupcake5,492,334);
        Cupcake cupcake6 = new Cupcake();
        addObject(cupcake6,272,471);
        Cupcake cupcake7 = new Cupcake();
        addObject(cupcake7,300,380);
        Cupcake cupcake8 = new Cupcake();
        addObject(cupcake8,275,258);
        Cupcake cupcake9 = new Cupcake();
        addObject(cupcake9,219,165);
        Cupcake cupcake10 = new Cupcake();
        addObject(cupcake10,169,303);
        Fly fly = new Fly();
        addObject(fly,91,477);
    }
}