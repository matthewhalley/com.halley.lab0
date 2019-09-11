import javax.swing.*;

public class Ex2 {
    public static void main(String[] args) {
        String FirstName, LastName, Initial;


        FirstName = JOptionPane.showInputDialog("First Name:");
        Initial = JOptionPane.showInputDialog("Initial");
        LastName = JOptionPane.showInputDialog("Last Name:");

        int Distance = Integer.parseInt(JOptionPane.showInputDialog("Distance Cycled:"));

        JOptionPane.showMessageDialog(null, "Cyclist Name: " + FirstName + " " + Initial + " " +LastName + "\nDistance Cycled: " + Distance + "Km\n" + "Money Due: ");
    }
}
