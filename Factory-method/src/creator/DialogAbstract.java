package creator;

import product.ButtonInterface;

public abstract class DialogAbstract {

  // The factory method that subclasses must implement.
  public abstract ButtonInterface createButton();

  public void renderButton() {
    ButtonInterface okButton = createButton();
    okButton.onClick(this::CloseDialog);
    okButton.render();
  }

  private void CloseDialog() {
    System.out.println("Dialog closed.");
  }
}
