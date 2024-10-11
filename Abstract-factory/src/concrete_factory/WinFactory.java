package concrete_factory;

import abstract_factory.GUIFactory;
import abstract_product.button;
import abstract_product.checkbox;
import concrete_product.WinButton;
import concrete_product.WinCheckbox;

public class WinFactory implements GUIFactory {

  @Override
  public button createButton() {
    System.out.println("Creating Win button");
    return new WinButton();
  }

  @Override
  public checkbox createCheckbox() {
    System.out.println("Creating Win checkbox");
    return new WinCheckbox();
  }

}
