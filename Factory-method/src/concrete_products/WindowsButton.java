package concrete_products;
import product.ButtonInterface;

public class WindowsButton implements ButtonInterface {

  @Override
  public void render() {
    // Render a button in Windows style.
    System.out.println("Rendering a Windows style button.");
  }

  @Override
  public void onClick(Runnable f) {
    // Bind a native OS click event.
    System.out.println("Windows button clicked.");
    f.run();
  }
}
