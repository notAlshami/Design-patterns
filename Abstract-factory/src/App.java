import abstract_factory.GUIFactory;
import concrete_factory.MacFactory;
import concrete_factory.WinFactory;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    try {
      GUIFactory b =  new App().getFactory("win");
      b.createCheckbox();
      b.createCheckbox().paint();
    }
    catch(Exception e) {
      System.err.println(e.getMessage());
    }
  }

  public GUIFactory getFactory(String type) throws Exception {
    switch (type.toLowerCase()) {
      case "win":
        return new WinFactory();
      
      case "mac":
        return new MacFactory();
      default:
        throw new Exception("Button not available");
    }
  }
}
