package flyweight;

public class Point implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("Point has been draw with" +" x: "+x+" y: "+y +" coordinate");
    }
}
