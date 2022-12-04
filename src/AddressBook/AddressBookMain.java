/*
 * File Name:	addressbook.java
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
 *		View:		Allows the user to view a contact.
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

// Packages

public class AddressBookMain {
	/**
	 * This class contains the display menu as well as the scanner for user input. Each option 
	 * in the menu is put into switch functions and implemented as per the choice of the user.
	 * The data of the contacts are stored in this class as name, age, email, phone number, 
	 * home address, ID, student GPA, and faculty salary.
	 * This class also contains the error message when an invalid input is entered. 
	 * 
	 * @param args A String array containing any command line options.
	 * @return A String representing a person's name, age, email, phone number, home address, 
	 *         ID, student GPA, faculty salary.
	 */

	public static void main(String[] args) {
		
		// Declared variables.
		boolean cSelected = false;
		char menuChoice = '\n';

		// Do-while loop.
		do {
			menuChoice = menuOperationSelection().charAt(0);
			cSelected = processChoice(menuChoice, cSelected);
		} while (menuChoice != 'X');

	}

	public static boolean processChoice(char menuChoice, boolean cSelected) {
		// Declared variables.
		ArrayList<Person> list = new ArrayList<Person>();
		Iterator<Person> iterList = list.iterator();
		char personChoice;
		float sGPA = -1;
		String fTitle = "\n";
		int fSalary = -1;
		boolean found = false;
		int dID = -1;
		// Declared scanner.
		Scanner scnr = new Scanner(System.in);
		
		

		
		// If-else statement.
		// Create option from menu options.
		if (menuChoice == 'C') {
			cSelected = true;
			// Person person = new Person();
			Person cTemp = createInput(found, list);
			personChoice = menuTypeSelection().charAt(0);
			switch (personChoice) {
			// Student selection.		
			case 'S':
				System.out.println("Student GPA:");
				sGPA = scnr.nextInt();
				list.add(new Student(cTemp, sGPA));
				break;
			// Faculty selection.
			case 'F':
				System.out.println("Salary:");
				fSalary = scnr.nextInt();
				System.out.println("Job Title:");
				fTitle = scnr.nextLine();
				list.add(new Faculty(fSalary, fTitle));
				break;
			// Default.
			default:
				list.add(cTemp);
				//list.add(new Person("Unknown", -1, "Unknown","Unknown", "Unknown", pID));
				// list.add(new Person(pName, pAge, pEmail, pPhoneNum, pAddress, pID));
				break;
			}
		// Retrieve option from menu options.
		} else if (menuChoice == 'R' && cSelected) {
			found = false;
			System.out.print("\nEnter ID: ");
			dID = scnr.nextInt();
			while (iterList.hasNext()) {
				Person pRetrieve = iterList.next();
				if (pRetrieve.getID() == dID) {
					System.out.println(pRetrieve);
					found = true;
				}
				if (found == false) {
					System.out.println("Person does not exist.");
				}

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
				System.out.println("\nPerson does not exist.");
			}
		// View option from menu options.
		} else if (menuChoice == 'V' & cSelected) {
			
			System.out.println("");
			while (iterList.hasNext()) {
				Person pView = iterList.next();
				System.out.println(pView);
			}
		// Exit option from menu options.
		} else if (menuChoice == 'X') {
			System.out.println("\nThank you for using Team 2's Address Book");
		} else {
			System.out.println("\nPlease enter one of the option from the menu!");
		}
		// Sorts the list
		Collections.sort(list, (p1, p2) -> p1.getID() - (p2.getID()));
		// Return the user selection from menu options.
		return cSelected;
	}
	// Information intake of person once create option is selected from menu option.
	public static Person createInput(boolean found, ArrayList<Person> list) {
		Person asdf;
		String pName = "\n";
		String pEmail = "\n";
		String pAddress = "\n";
		String pPhoneNum = "\n";
		int pAge = -1;
		int pID = -1;
		boolean temp = false;
		Scanner sScan = new Scanner(System.in);
		Scanner iScan = new Scanner(System.in);

		System.out.println("\nPlease enter the following information:");

		System.out.print("\nFull Name: ");
		// pName = sScan.nextLine();
		pName = " my name";

		System.out.print("Age: ");
		// pAge = iScan.nextInt();
		pAge = 12;
		// Displays error message when incorrect email format is entered
		do {
			System.out.print("Email: ");
			// pEmail = sScan.nextLine();
			pEmail = "my@email.com";
			if (Person.checkEmail(pEmail) == false) {
				System.out.println("Email is not correct format.");
			}
		} while (Person.checkEmail(pEmail) == false);

		System.out.print("Phone Number: ");
		pPhoneNum = sScan.nextLine();
		//pPhoneNum = 1243242340;

		// This is here because home address keeps getting skipped and no idea why
		if (temp == false) {
			System.out.print("Home Address: ");
			// pAddress = sScan.nextLine();
			pAddress = "my home address ";
			temp = true;
		}
		System.out.print("ID Number: ");
		pID = iScan.nextInt();

		asdf = new Person(pName, pAge, pEmail, pPhoneNum, pAddress, pID);

		return asdf;
	}
	// Displays the menu options for user to select from.
	public static String menuOperationSelection() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("\nAddressBook Menu\n");
		System.out.println("(C)reate");
		System.out.println("(R)etrieve");
		System.out.println("(U)pdate");
		System.out.println("(D)elete");
		System.out.println("(V)iew");
		System.out.println("E(X)it\n");
		System.out.print("Choice: ");
		String menuChoice = scnr.next().toUpperCase();
		// Returns menu choice.
		return menuChoice;
	}
	// Gives user option to select either faculty or student when create option is selected.
	public static String menuTypeSelection() {
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
