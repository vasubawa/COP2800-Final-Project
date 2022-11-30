package addressBook;

import java.util.Scanner;
/*EXAMPLE of how it should be in here:
 * 
public class RestaurantFavorites {
   public static void main(String[] args) {
      Restaurant favLunchPlace = new Restaurant();
      Restaurant favDinnerPlace = new Restaurant();

      favLunchPlace.setName("Central Deli");
      favLunchPlace.setRating(4);

      favDinnerPlace.setName("Friends Cafe");
      favDinnerPlace.setRating(5);

      System.out.println("My favorite restaurants: ");
      favLunchPlace.print();
      favDinnerPlace.print();
   }
}
OUTPUT:
My favorite restaurants: 
Central Deli -- 4
Friends Cafe -- 5
 */
public class AddressBook {
	public static void main(String[] args) throws Exception { 
		char menuChoice = '\n';
		Scanner scnr = new Scanner(System.in);
		//System.out.println("Welcome to Team 2's Address Book.");

		// A loop that will keep the program running as long as "X" isn't entered
		do {
			// Gets the users Input from the menu.
			menuChoice = menu().charAt(0);
			processChoice(menuChoice);

			// Stops the loop if "X" is entered.
		} while (menuChoice != 'X');
			// Prints good-bye message.
			System.out.println("\nThank you for using Team 2's Address Book! Good-bye!");
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

	public static char processChoice(char menuChoice){
		System.out.println("Inside processChoice");
		switch(menuChoice){
			// Case C
			case 'C':
				System.out.println("");
		}
		return menuChoice;
	}

}

