package concrete_product;

import abstract_product.button;

public class MacButton implements button {

  @Override
  public void paint() {
    System.out.println("Mac button");
  }

}
