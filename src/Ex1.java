
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String Name, NameClass;
        int SnackQty, SnackCost=2;

        Scanner input= new Scanner(System.in);
        //User fills in details here
        System.out.print("Enter Name: ");
        Name = input.nextLine();

        System.out.print("Class Name: ");
        NameClass = input.nextLine();

        System.out.print("How many snacks are you ordering? ");
        SnackQty = input.nextInt();
        //User is given a summary of info inputted
        System.out.println("Order Summary:\n" + "Name: " + Name + "\nClass: " + NameClass + "\nQty of snacks ordered: " + SnackQty + "\nTotal Cost: " + "€" + (SnackQty * SnackCost));
    }
}
