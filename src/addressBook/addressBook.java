package addressBook;
import java.util.Scanner;

public class addressBook {
    public static void main(String[] args) throws Exception { 


        char menuChoice = '\n';
        Scanner scnr = new Scanner(System.in);
        //System.out.println("Welcome to Team 2's Address Book.");

        // A loop that will keep the program running as long as "X" isn't entered
        do {
            // Gets the users Input from the menu.
            menuChoice = userInput(scnr).charAt(0);

            if (menuChoice != 'C') {
                System.out.println("\n\tError: Please select option N from the menu first!");
            } else {
            }
            // Stops the loop if "X" is entered.
        } while (menuChoice != 'X');
        // Prints good-bye message.
        System.out.println("\nThank you for using Team 2's Address Book! Good-bye!");
    }

    public static void processChoice(){

    }
    /**
     * Prints out the menu for the user to select from.
     * 
     * @return menuChoice Returns whatever the user has inputted.
     */
    public static String menu() {
        // Declaring String Variable;
        Scanner scnr = new Scanner(System.in);
        String menuChoice;
        // Menu options for user to choose.
        System.out.println("\nAddressBook Menu\n");
        System.out.println("(C)reate");
        System.out.println("(R)etrieve");
        System.out.println("(U)pdate");
        System.out.println("(D)elete");
        System.out.println("E(X)it\n");
        System.out.print("Choice: ");

        // Exit processing
        menuChoice = scnr.nextLine();
        menuChoice = menuChoice.toUpperCase();
        scnr.close();
        // Returns the choice
        return menuChoice;
    }
}

