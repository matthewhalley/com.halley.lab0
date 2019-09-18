import javax.swing.*;

public class Ex2 {
    public static void main(String[] args) {
        String FirstName, LastName, Initial;
        double SponAmt = 0;

        FirstName = JOptionPane.showInputDialog("First Name:");
        Initial = JOptionPane.showInputDialog("Initial");
        LastName = JOptionPane.showInputDialog("Last Name:");

        int Distance = Integer.parseInt(JOptionPane.showInputDialog("Distance Cycled:"));

        if (Distance <= 10)
            SponAmt = Distance * 0.07;
        else if (Distance >= 10)
            SponAmt = 10 * 0.07 + (Distance - 10) * 0.1;




        JOptionPane.showMessageDialog(null, "Cyclist Name: " + FirstName + " " + Initial + " " +LastName + "\nDistance Cycled: " + Distance + "Km\n" + "Money Due: " + SponAmt + "Euro");
    }
}
