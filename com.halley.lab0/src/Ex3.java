import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {
        String name;
        double tax = 0, taxRate;

        name = JOptionPane.showInputDialog("Please enter your name: ");

        int income = Integer.parseInt(JOptionPane.showInputDialog("Please enter your income: "));

    if (income <= 20000)
        tax = 0;
    else if (income > 20000 || (income < 36000))
        tax = (income*0.20);
        taxRate = 20;
    if (income > 36000)
        tax = (income*0.41);
        taxRate = 41;

    JOptionPane.showMessageDialog(null, name + ", your tax summary is: \n" +
            "\nTaxable income: " + (income - 20000) + "\nTax due: " + tax + "\nGross income: " + income);
    JOptionPane.showMessageDialog(null, "Tax Rate is " + taxRate + "%" + "\nTotal tax: " + tax + "\nIncome after tax: " + (income - tax));
    }
}
