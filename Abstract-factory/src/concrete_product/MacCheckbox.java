package concrete_product;

import abstract_product.checkbox;

public class MacCheckbox implements checkbox {

  @Override
  public void paint() {
    System.out.println("Mac checkbox");
  }

}
