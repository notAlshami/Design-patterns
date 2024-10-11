package Shapes;

import Shape.Shape;

public class Rectangle extends Shape {

  public int width, height;

  public Rectangle(int width, int height, String color) {
    this.width = width;
    this.height = height;
    this.color = color;
  }

  public Rectangle(Rectangle rectangle) {
    super(rectangle);
    this.width = rectangle.width;
    this.height = rectangle.height;
  }

  @Override
  public Rectangle myClone() {
    return new Rectangle(this);
  }
}
