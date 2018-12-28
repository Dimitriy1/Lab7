package flyweight;

public class Square implements Shape {
    private int side = 20;
    @Override
    public void draw(int x, int y) {
        System.out.println("Point has been draw with" +" x: "+x+" y: "+y +" coordinate and side: "+20);
    }
}
