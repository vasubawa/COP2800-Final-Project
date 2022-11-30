package addressBook;
import java.util.Scanner;

public class addressBook {
    public static void main(String[] args) throws Exception { 


        String menuChoice;
        Scanner scnr = new Scanner(System.in);
        //System.out.println("Welcome to Team 2's Address Book.");

        //Another testing
        do {
            menuChoice = userInput(scnr);
            
        } while (!menuChoice.equals("X"));

        System.out.println("\nGood-bye");
    }

    public static void processChoice(){

    }
    /**
     * Prints out the menu for the user to select from.
     * 
     * @return menuChoice Returns whatever the user has inputted.
     */
    public static String userInput(Scanner scnr) {
        // Declaring String Variable;
        String menuChoice;
        // Menu options for user to choose.
        System.out.println("\nAddressBook Menu\n");
        System.out.println("(C)reate");
        System.out.println("(R)etrieve");
        System.out.println("(U)pdate");
        System.out.println("(D)elete");
        System.out.println("E(X)it\n");
        System.out.print("Choice: ");

        menuChoice = scnr.nextLine();
        menuChoice = menuChoice.toUpperCase();
        // Returns the choice
        return menuChoice;
    }
}

