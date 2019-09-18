import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {
        int total =0, intEntry = 0;
        String entry;
        //read in entry
        entry = JOptionPane.showInputDialog("Please enter a number.");

        //while entry is not "q"

        while(!entry.equals("q"))
        {

            //convert to num
            intEntry = Integer.parseInt(entry);

            //add to running total
            total+=intEntry;

            //add to number count
            intEntry++;
            //go back an do it again
            entry = JOptionPane.showInputDialog("Please enter a number.");

        //output results
                                                                      //while (number != "q"){

        } //end while
        JOptionPane.showMessageDialog(null, "the total of all numbers is: " + total + "entries are" + intEntry);
    } //end main

} // end c;lass
