package concrete_product;

import abstract_product.button;

public class WinButton implements button {

  @Override
  public void paint() {
    System.out.println("Windows button");
  }

}
