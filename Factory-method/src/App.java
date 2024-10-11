import concrete_creators.WindowsDialog;
import creator.DialogAbstract;

public class App {

    private static DialogAbstract dialog;
    public static void main(String[] args) throws Exception {
        dialog = new WindowsDialog();
        dialog.renderButton();
    }
}
