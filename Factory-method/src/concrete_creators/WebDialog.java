package concrete_creators;

import concrete_products.HTMLButton;
import creator.DialogAbstract;
import product.ButtonInterface;

public class WebDialog extends DialogAbstract {

  @Override
  public ButtonInterface createButton() {
    return new HTMLButton();
  }

  @Override
  public void renderButton() {
    ButtonInterface okButton = createButton();
    okButton.onClick(this::CloseDialog);
    okButton.render();
  }

  private void CloseDialog() {
    System.out.println("HTML Dialog closed.");
  }
}
