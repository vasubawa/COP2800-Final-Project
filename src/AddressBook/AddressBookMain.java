package AddressBook;

import java.util.*;

public class AddressBookMain {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		boolean cSelected = false;
		char menuChoice = '\n';

		do {
			menuChoice = menuOperationSelection().charAt(0);
			cSelected = processChoice(menuChoice, list, cSelected);
		} while (menuChoice != 'X');

	}

	public static boolean processChoice(char menuChoice, ArrayList<Person> list, boolean cSelected) {

		int pID = -1;

		char personChoice;
		float sGPA = -1;
		int sID = -1;
		String fTitle = "\n";
		int fSalary = -1;
		Scanner scnr = new Scanner(System.in);
		boolean found = false;
		int dID = -1;

		Iterator<Person> iterList = list.iterator();
		if (menuChoice == 'C') {
			cSelected = true;
			// Person person = new Person();
			Person cTemp = createInput(found, list);
			personChoice = menuTypeSelection().charAt(0);
			switch (personChoice) {
			case 'S':
				System.out.println("Student GPA:");
				sGPA = scnr.nextInt();
				list.add(new Student(cTemp, sGPA));
				break;

			case 'F':
				System.out.println("Salary:");
				fSalary = scnr.nextInt();
				System.out.println("Job Title:");
				fTitle = scnr.nextLine();
				list.add(new Faculty(cTemp, fSalary, fTitle));
				break;

			default:
				list.add(cTemp);
				list.add(new Person("Unknown", -1, "Unknown", -1, "Unknown", pID));
				// list.add(new Person(pName, pAge, pEmail, pPhoneNum, pAddress, pID));
				break;
			}

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
		} else if (menuChoice == 'V' & cSelected) {
			System.out.println("");
			while (iterList.hasNext()) {
				Person pView = iterList.next();
				System.out.println(pView);
			}
		} else if (menuChoice == 'X') {
			System.out.println("\nThank you for using Team 2's Address Book");
		} else {
			System.out.println("\nPlease enter one of the option from the menu!");
		}
		return cSelected;
	}

	public static Person createInput(boolean found, ArrayList<Person> list) {
		Person asdf;
		String pName = "\n";
		String pEmail = "\n";
		String pAddress = "\n";
		long pPhoneNum = -1;
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

		do {
			System.out.print("Email: ");
			// pEmail = sScan.nextLine();
			pEmail = "my@email.com";
			if (Person.checkEmail(pEmail) == false) {
				System.out.println("Email is not correct format.");
			}
		} while (Person.checkEmail(pEmail) == false);

		System.out.print("Phone Number: ");
		// pPhoneNum = iScan.nextInt();
		pPhoneNum = 124324234;

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
		// asdf = new Person("Unknown", -1, "Unknown", -1, "Unknown", pID);

		return asdf;
	}

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
		return menuChoice;
	}

	public static String menuTypeSelection() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("\nSelect person type to process, otherwise press enter any key to exit:\n");
		System.out.println("(F)aculty");
		System.out.println("(S)tudent\n");
		System.out.print("Choice: ");
		String type = scnr.nextLine().toUpperCase();
		return type;
	}
}