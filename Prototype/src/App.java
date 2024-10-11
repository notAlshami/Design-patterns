import java.util.ArrayList;

import Shape.Shape;
import Shapes.Circle;

public class App {

  public static ArrayList<Shape> shapes;

  public static void main(String[] args) throws Exception {
    shapes = new ArrayList<>();
    Circle x = new Circle(5, "Red");
    shapes.add(x);

    ArrayList<Shape> shapesCopy = new ArrayList<>();

    for (Shape shape : shapes) {
      shapesCopy.add(shape.myClone());
    }
  }
}
