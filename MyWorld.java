import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero h = new Hero();
        addObject(h, 100, 200);
        
        Enemy barrel = new Enemy();
        addObject(barrel, 300, 300);
    }
}
