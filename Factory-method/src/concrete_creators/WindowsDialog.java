package concrete_creators;

import concrete_products.WindowsButton;
import creator.DialogAbstract;
import product.ButtonInterface;

public class WindowsDialog extends DialogAbstract {

  @Override
  public ButtonInterface createButton() {
    return new WindowsButton();
  }

  @Override
  public void renderButton() {
    ButtonInterface okButton = createButton();
    okButton.onClick(this::CloseDialog);
    okButton.render();
  }

  private void CloseDialog() {
    System.out.println("Windows Dialog closed.");
  }
}
