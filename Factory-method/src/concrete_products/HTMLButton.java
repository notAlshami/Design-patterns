package concrete_products;
import product.ButtonInterface;

public class HTMLButton implements ButtonInterface {

  @Override
  public void render() {
    // Render a button in HTML style.
    System.out.println("Rendering a HTML style button.");
  }

  @Override
  public void onClick(Runnable f) {
    // Bind a native OS click event.
    System.out.println("HTML button clicked.");
    f.run();
  }
}
