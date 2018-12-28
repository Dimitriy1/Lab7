package flyweight;

public class Circle implements Shape  {
    private int radius = 20;

    @Override
    public void draw(int x, int y) {
        System.out.println("Point has been draw with" +" x: "+x+" y: "+y +" coordinate and radius: "+20);
    }
}
