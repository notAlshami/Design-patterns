package Shape;

import Clone_interface.MyClone;

public abstract class Shape implements MyClone<Shape> {

  public String color;
  private int x, y;

  public Shape() {
    System.out.println("Shape is created");
  }

  public Shape(Shape shape) {
    System.out.println("Shape is cloned");
    this.color = shape.color;
    this.x = shape.x;
    this.y = shape.y;
  }
}
