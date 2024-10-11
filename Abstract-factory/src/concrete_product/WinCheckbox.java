package concrete_product;

import abstract_product.checkbox;

public class WinCheckbox implements checkbox {

  @Override
  public void paint() {
    System.out.println("Windows checkbox");
  }

}
