import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero h = new Hero();
        addObject(h, 100, 200);
        
        Enemy e = new Enemy();
        addObject(e, 200, 200);
    }
}
