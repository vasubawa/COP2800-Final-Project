package AddressBook;

import java.util.*;

public class AddressBookMain {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		// Scanner scan = new Scanner(System.in);
		char menuChoice = '\n';

		do {
			menuChoice = menuOperationSelection().charAt(0);
			processChoice(menuChoice, list);
		} while (menuChoice != 'X');

		System.out.println("Thank you for using Team 2's Address Book");

	}

	public static void processChoice(char menuChoice, ArrayList<Person> list) {
		// String pName = "\n";
		// String pEmail = "\n";
		// String pAddress = "\n";
		// long pPhoneNum = -1;
		// int pAge = -1;
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
		switch (menuChoice) {
		case 'C':
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

			break;

		case 'R':
			found = false;
			System.out.print("\nEnter ID : ");
			dID = scnr.nextInt();
			while (iterList.hasNext()) {
				Person pRetrieve = iterList.next();
				if (pRetrieve.getID() == dID) {
					System.out.println(pRetrieve);
					found = true;
				}
				if (!found) {
					System.out.println("Person does not exist.");
				}

			}
			break;

		case 'U':
			found = false;
			System.out.print("\nEnter ID To Update: ");
			dID = scnr.nextInt();
			ListIterator<Person> listIterator = list.listIterator();
			while (listIterator.hasNext()) {
				Person pUpdate = iterList.next();
				if (pUpdate.getID() == dID) {
					Person uTemp = createInput(found, list);
					iterList.remove();
					// listIterator.set(uTemp);
					list.add(uTemp);
					found = true;
				}
				if (!found) {
					System.out.println("Person does not exist.");
				} else if (found) {
					System.out.println("Person with that ID has been Update.");
					break;
				}

			}
			break;

		case 'D':
			found = false;
			System.out.print("\nEnter ID To Delete: ");
			dID = scnr.nextInt();
			while (iterList.hasNext()) {
				Person pDelete = iterList.next();
				if (pDelete.getID() == dID) {
					iterList.remove();
					found = true;
				}
				if (!found) {
					System.out.println("Person does not exist.");
				} else if (found) {
					System.out.println("Person with that ID has been deleted.");
					break;
				}

			}
			break;

		case 'V':

			while (iterList.hasNext()) {
				Person pView = iterList.next();
				System.out.println(pView);
			}
			break;

		default:
			System.out.println("Please enter one of the option from the menu!");
		}
	}

	public static Person createInput(boolean found, ArrayList<Person> list) {
		Person asdf;
		String pName = "\n";
		String pEmail = "\n";
		String pAddress = "\n";
		long pPhoneNum = -1;
		int pAge = -1;
		int pID = -1;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter the following information:");

		System.out.println("Full Name:");
		pName = "pName"; // scnr.nextLine();

		System.out.println("Age:");
		pAge = -1;// scnr.nextInt();

		do {
			System.out.println("Email:");
			pEmail = "p@email.com"; // scnr.next();
			if (Person.checkEmail(pEmail) == false) {
				System.out.println("Email is not correct format.");
			}
		} while (Person.checkEmail(pEmail) == false);

		System.out.println("Phone Number:");
		pPhoneNum = -1;// scnr.nextLine();

		System.out.println("Home Address:");
		pAddress = "pAddress";// scnr.nextLine();

		System.out.println("ID Number:");
		pID = scnr.nextInt();

		asdf = new Person("Unknown", -1, "Unknown", -1, "Unknown", pID);

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
		System.out.println("\nSelect person type to process(if any):\n");
		System.out.println("(F)aculty");
		System.out.println("(S)tudent");
		System.out.println("E(X)it\n");
		System.out.print("Choice: ");
		String type = scnr.nextLine().toUpperCase();
		return type;
	}
}