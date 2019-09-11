import javax.swing.*;

public class Ex1Ver2 {
    public static void main(String[] args) {
        String Name, NameClass;
        int SnackCost=2;


        Name = JOptionPane.showInputDialog("Name: ");

        NameClass = JOptionPane.showInputDialog("Class Name: ");

        int SnackQty = Integer.parseInt(JOptionPane.showInputDialog("Number of snacks ordered: "));

        JOptionPane.showMessageDialog(null, "Order Summary:\n" + "Name: " + Name
                + "\nClass: " + NameClass + "\nQty of snacks ordered: " + SnackQty + "\nTotal Cost: " + "€" + (SnackQty * SnackCost) );


    }
}
