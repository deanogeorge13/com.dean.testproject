import javax.swing.*;

public class Welcome {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Welcome " + name + " to year 2", "Welcome", JOptionPane.PLAIN_MESSAGE);
    }
}
