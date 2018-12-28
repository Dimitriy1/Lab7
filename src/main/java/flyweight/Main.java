package flyweight;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape>shapes = new LinkedList<>();

        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("circle"));

        Random random = new Random();
        for (Shape shape:shapes) {
            int x = random.nextInt(1000000);
            int y = random.nextInt(1000000);
            shape.draw(x,y);
        }
    }
}
