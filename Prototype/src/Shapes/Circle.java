package Shapes;

import Shape.Shape;

public class Circle extends Shape {

  public int radius;

  public Circle(int radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public Circle(Circle circle) {
    super(circle);
    this.radius = circle.radius;
  }

  @Override
  public Circle myClone() {
    return new Circle(this);
  }
}
