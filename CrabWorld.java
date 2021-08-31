import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,226,204);
        Worm worm = new Worm();
        addObject(worm,51,52);
        Worm worm2 = new Worm();
        addObject(worm2,376,128);
        Worm worm3 = new Worm();
        addObject(worm3,359,245);
        Worm worm4 = new Worm();
        addObject(worm4,185,372);
        Worm worm5 = new Worm();
        addObject(worm5,412,428);
        Worm worm6 = new Worm();
        addObject(worm6,219,74);
        Worm worm7 = new Worm();
        addObject(worm7,68,270);
        Worm worm8 = new Worm();
        addObject(worm8,115,476);
        lobster lobster = new lobster();
        addObject(lobster,378,180);
    }
}