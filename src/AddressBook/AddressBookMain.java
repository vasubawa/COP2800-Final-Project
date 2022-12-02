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

	}

	public static void processChoice(char menuChoice, ArrayList<Person> list) {

		String pName = "\n";
		String pEmail = "\n";
		String pAddress = "\n";
		long pPhoneNum = -1;
		int pAge = -1;

		char personChoice;
		float sGPA = -1;
		int sID = -1;
		String fTitle = "\n";
		int fSalary = -1;

		Iterator iterate = list.iterator();
		Scanner sScan = new Scanner(System.in);
		Scanner iScan = new Scanner(System.in);

		switch (menuChoice) {
		case 'C':
			// Person person = new Person();
			System.out.println("Please enter the following information:");

			System.out.println("Full Name:");
			pName = "pName"; // sScan.nextLine();

			System.out.println("Age:");
			pAge = -1;// iScan.nextInt();

			do {
				System.out.println("Email:");
				pEmail = "p@email.com"; // sScan.next();
				if (Person.checkEmail(pEmail) == false) {
					System.out.println("Email is not correct format.");
				}
			} while (Person.checkEmail(pEmail) == false);

			// System.out.println("Email:");
			// pEmail = "p@email.com";//sScan.nextLine();

			System.out.println("Phone Number:");
			pPhoneNum = -1;// sScan.nextLine();

			System.out.println("Home Address:");
			pAddress = "pAddress";// sScan.nextLine();

			// person.setName(pName);
			// person.setAge(pAge);
			// person.setEmail(pEmail);
			// person.setPhoneNum(pPhoneNum);
			// person.setAddress(pAddress);

			personChoice = menuTypeSelection().charAt(0);
			switch (personChoice) {

			case 'S':
				System.out.println("Student ID:");
				sID = iScan.nextInt();
				System.out.println("Student GPA:");
				sGPA = iScan.nextInt();
				// p.add(new Student(pAge,pEmail , pAddress, pName, pPhoneNum, sID, sGPA));
				break;

			case 'F':
				System.out.println("Salary:");
				fSalary = iScan.nextInt();
				System.out.println("Job Title:");
				fTitle = sScan.nextLine();
				// p.add(new Faculty(fullName, age, email, phoneNum, address, fSalary, fTitle));
				break;

			default:
				list.add(new Person(pName, pAge, pEmail, pPhoneNum, pAddress));
				// list.add(person);
				break;
			}
			break;
		case 'V':
			System.out.println("Name | Age | Email | Phone Number | Home Address |");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			// System.out.println("\nContact " + (i + 1) + "\n");
			/*
			 * //System.out.println(p); while (iterate.hasNext()) { Object pTemp =
			 * iterate.next(); System.out.println(pTemp); }
			 */
			// System.out.print(p);
			// for (Person pr : p){
			// System.out.print(pr.toString());
			// }asdasdasdasd
			break;
		}
	}

	public static String menuOperationSelection() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("\nAddressBook Menu\n");
		System.out.println("(C)reate");
		System.out.println("(R)etrieve");
		System.out.println("(U)pdate");
		System.out.println("(D)elete");
		System.out.println("(V)iew:");
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
