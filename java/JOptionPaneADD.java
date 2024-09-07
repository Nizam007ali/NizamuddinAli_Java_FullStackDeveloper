package git;
import javax.swing.JOptionPane;

public class JOptionPaneADD {

    public static void main(String str[]) {
        int a = 0, b, d;
        while (true) {
            b = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
            a = a + b;
            JOptionPane.showMessageDialog(null, ("Sum = " + a));
            d = JOptionPane.showConfirmDialog(null, "do you want to sum another value");
            if (d == 0) {
            } else if (d == 1) {
            JOptionPane.showMessageDialog(null, ("Final Sum = " + a));
                break;
            } else {
                JOptionPane.showMessageDialog(null, "wrong choice...");
                break;
            }
        }
    }
}
