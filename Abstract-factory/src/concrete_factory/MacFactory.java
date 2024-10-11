package concrete_factory;

import abstract_factory.GUIFactory;
import abstract_product.button;
import abstract_product.checkbox;
import concrete_product.MacButton;
import concrete_product.MacCheckbox;

public class MacFactory implements GUIFactory {

  @Override
  public button createButton() {
    System.out.println("Creating Mac button");
    return new MacButton();
  }

  @Override
  public checkbox createCheckbox() {
    System.out.println("Creating Mac checkbox");
    return new MacCheckbox();
  }

}
