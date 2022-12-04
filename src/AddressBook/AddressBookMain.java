/**
 * File Name:	AddressBookMain.java
 * Names:	Mohammed Khan, Emanuel Martins, Dhruv Sharma, and Hammad Uddin
 * Course:	COP 2800C at Valencia College
 * Professor:	David Stendel 
 * Description:	This program allows the user to create, retrieve, update, delete, and view contacts in 
 *		an address book.
 *		The program displays a menu that lists an option for the user to choose from:
 *		Create:		Allows the user to create a contact.
 *		Retrieve: 	Allows the user to retrieve a contact.
 *		Update:		Allows the user to update a contact.
 *		Delete:		Allows the user to delete a contact.
 *		Exit:		Allows the user exit from the program.
 *		The program also includes one Person class and two subclasses, Faculty, and Student that 
 *		extend from the Person class.
 *		The Person class allows the user to enter the following information:
 *		Name, age, email, phone number, home address, ID.
 *		The Faculty class allows the user to enter salary.
 *		The Student class allows the user to enter GPA.
 *		The program also displays an error message when an invalid input is entered.	
 *		The program also displays an exit message when the exit option is selected.
 * Date:	12/3/22
 */

package AddressBook;

// Packages
import java.util.*;

/**
 * This program is an address book displays a menu that allows the user to
 * create, retrieve, update, delete, and exit the program.
 *
 * @author Mohammed Khan
 * @author Emanuel Martins
 * @author Dhruv Sharma
 * @author Hammad Uddin
 * 
 * @param args A String array containing any command line options.
 * @return A String representing a person's name, age, email, phone number, home
 *         address, ID, student GPA, faculty salary.
 *
 * @version 4.5, 12/3/22
 */

public class AddressBookMain {
	/**
	 * This class contains the display menu as well as the scanner for user input.
	 * Each option in the menu is put into switch functions and implemented as per
	 * the choice of the user. The data of the contacts are stored in this class as
	 * name, age, email, phone number, home address, ID, student GPA, and faculty
	 * salary. This class also contains the error message when an invalid input is
	 * entered.
	 *
	 * @param args A String array containing any command line options.
	 * @return A String representing a person's name, age, email, phone number, home
	 *         address, ID, student GPA, faculty salary.
	 */

	public static void main(String[] args) {

		// Declared variables.
		ArrayList<Person> list = new ArrayList<Person>();
		boolean cSelected = false;
		char menuChoice = '\n';
		// Do-while loop.
		do {
			menuChoice = menuOperationSelection().charAt(0);
			cSelected = processChoice(menuChoice, list, cSelected);
		} while (menuChoice != 'X');

	}

	public static boolean processChoice(char menuChoice, ArrayList<Person> list, boolean cSelected) {
		/**
		 * This method allows the program to intake the input by the user and run it
		 * through the if-else and switch statements.
		 * 
		 * @return the choice selected by the user from the option menu.
		 */
		// Declared variables.
		boolean found = false;
		int dID = -1;
		Scanner scnr = new Scanner(System.in);

		Iterator<Person> iterList = list.iterator();
		// If-else statement.
		// Create option from menu options.
		if (menuChoice == 'C') {
			cSelected = true;
			list.add(createInput(found, list));

			// Retrieve option from menu options.
		} else if (menuChoice == 'R' && cSelected) {
			System.out.println("");
			while (iterList.hasNext()) {
				Person pView = iterList.next();
				System.out.println(pView);
			}
			// Update option from menu options.
		} else if (menuChoice == 'U' && cSelected == true) {
			found = false;
			System.out.print("\nEnter ID To Update: ");
			dID = scnr.nextInt();
			ListIterator<Person> listIterator = list.listIterator();
			while (listIterator.hasNext()) {
				Person pUpdate = iterList.next();
				if (pUpdate.getID() == dID) {
					Person uTemp = createInput(found, list);
					iterList.remove();
					list.add(uTemp);
					found = true;
				}
				if (!found) {
					System.out.println("\nPerson does not exist.");
				} else if (found) {
					System.out.println("\nPerson with that ID has been Update.");
					break;
				}
			}
			// Delete option from menu options.
		} else if (menuChoice == 'D' & cSelected) {
			found = false;
			System.out.print("\nEnter ID To Delete: ");
			dID = scnr.nextInt();
			while (iterList.hasNext()) {
				Person pDelete = iterList.next();
				if (pDelete.getID() == dID) {
					iterList.remove();
					found = true;
				}

			}
			if (found == true) {
				System.out.println("\nPerson with that ID has been deleted.");
			} else {
				System.out.println("\nPerson does not exist.s");
			}

			// Exit option from menu options.
		} else if (menuChoice == 'X') {
			System.out.println("\nThank you for using Team 2's Address Book!");
		} else {
			System.out.println("\nPlease enter one of the option from the menu!");
		}
		// Sorts the list
		Collections.sort(list, (p1, p2) -> p1.getID() - (p2.getID()));
		// Return the user selection from menu options.
		return cSelected;
	}

	public static Person createInput(boolean found, ArrayList<Person> list) {
		/**
		 * This method takes the input of the user for a person type once the create
		 * option is selected from the menu.
		 *
		 *@return A new person with the information entered by the user.
		 */
		Person asdf;
		String pName = "\n";
		String pEmail = "\n";
		String pAddress = "\n";
		String pPhoneNum = "\n";
		int pAge = -1;
		int pID = -1;
		float sGPA = -1;
		boolean temp = false;
		String fTitle = "\n";
		String fSalary = "\n";
		char personChoice;
		Scanner sScan = new Scanner(System.in);
		Scanner iScan = new Scanner(System.in);

		System.out.println("\nPlease enter the following information:");

		System.out.print("\nFull Name: ");
		pName = sScan.nextLine();

		do {
			System.out.print("Age: ");
			pAge = iScan.nextInt();
		} while (pAge < 0);

		// Displays error message when incorrect email format is entered
		do {
			System.out.print("Email: ");
			pEmail = sScan.nextLine();
			if (Person.checkEmail(pEmail) == false) {
				System.out.println("Email is not correct format.");
			}
		} while (Person.checkEmail(pEmail) == false);

		System.out.print("Phone Number: ");
		pPhoneNum = sScan.nextLine();

		if (temp == false) {
			System.out.print("Home Address: ");
			pAddress = sScan.nextLine();

		}
		System.out.print("ID Number: ");
		pID = iScan.nextInt();

		personChoice = menuTypeSelection().charAt(0);

		if (personChoice == 'F') {
			if (temp == false) {
				System.out.println("Salary:");
				fSalary = sScan.nextLine();
			}
			if (temp == false) {
				System.out.println("Job Title:");
				fTitle = sScan.nextLine();
			}
			asdf = new Faculty(pName, pAge, pEmail, pPhoneNum, pAddress, pID, fSalary, fTitle);
		} else if (personChoice == 'S') {
			System.out.println("Student GPA:");
			sGPA = iScan.nextFloat();
			asdf = new Student(pName, pAge, pEmail, pPhoneNum, pAddress, pID, sGPA);
		} else {
			asdf = new Person(pName, pAge, pEmail, pPhoneNum, pAddress, pID);
		}

		return asdf;
	}

	public static String menuOperationSelection() {
		/**
		 * This method displays the menu options for the user and takes the input from
		 * the user's choice.
		 *
		 *@return The user's choice from the option menu.
		 */
		Scanner scnr = new Scanner(System.in);
		System.out.println("\nAddressBook Menu\n");
		System.out.println("(C)reate");
		System.out.println("(R)etrieve");
		System.out.println("(U)pdate");
		System.out.println("(D)elete");
		System.out.println("E(X)it\n");
		System.out.print("Choice: ");
		String menuChoice = scnr.next().toUpperCase();
		// Returns menu choice.
		return menuChoice;
	}

	public static String menuTypeSelection() {
		/**
		 * This method gives user option to select either faculty or student when create 
		 * option is selected.
		 *
		 *@return The person type either faculty or student.
		 */
		Scanner scnr = new Scanner(System.in);
		System.out.println("\nSelect person type to process, otherwise press enter any key to exit:\n");
		System.out.println("(F)aculty");
		System.out.println("(S)tudent\n");
		System.out.print("Choice: ");
		String type = scnr.nextLine().toUpperCase();
		// Returns user selection of person type.
		return type;
	}
}
