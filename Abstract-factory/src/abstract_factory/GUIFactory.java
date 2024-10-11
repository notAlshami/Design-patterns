package abstract_factory;

import abstract_product.button;
import abstract_product.checkbox;

public interface GUIFactory {
  public button createButton();
  public checkbox createCheckbox();
}
