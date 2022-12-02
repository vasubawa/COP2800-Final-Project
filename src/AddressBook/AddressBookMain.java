package AddressBook;

import java.util.*;

public class AddressBookMain{
	public static void main(String[] args){

		//Scanner scan = new Scanner(System.in);
		char menuChoice = '\n';

		
		do{
			menuChoice = menuOperationSelection().charAt(0);
			processChoice(menuChoice);
		} while(menuChoice != 'X');

	}

	public static String processChoice(char menuChoice){
		String s = "FIX ME";
		Collection<Person> p = new ArrayList<Person>();
		String fullName = "\n";
		String email = "\n";
		String address = "\n";
		String fTitle = "\n";
		char personChoice;
		int age = -1;
		int sID = -1;
		int phoneNum = -1;
		int fSalary = -1;
		float sGPA = -1;
		

		Scanner scan = new Scanner(System.in);

		switch (menuChoice){
			case 'C':
				System.out.println("Please enter the following information:");
				System.out.println("Full Name:");
				fullName = scan.nextLine();
				System.out.println("Age:");
				age = scan.nextInt();
				System.out.println("Email:");
				email = scan.nextLine();
				System.out.println("Phone Number:");
				phoneNum = scan.nextInt();
				System.out.println("Home Address:");
				address = scan.nextLine();
				personChoice = menuTypeSelection().charAt(0);
				switch (personChoice){

					case 'F':
						System.out.println("Student ID:");
						sID = scan.nextInt();
						System.out.println("Student GPA:");
						sGPA = scan.nextInt();
						p.add(new Student(fullName, age, email, phoneNum, address, sID,  sGPA));
						break;

					case 'S':
						System.out.println("Salary:");
						fSalary = scan.nextInt();
						System.out.println("Job Title:");
						fTitle = scan.nextLine();
						p.add(new Faculty(fullName, age, email, phoneNum, address, fSalary,  fTitle));
						break;

					case 'V':
						System.out.print(p);
					default:
					p.add(new Faculty(fullName, age, email, phoneNum, address));
						break;
				}
				break;
			
		}
		return s;
	}

	public static String menuOperationSelection(){
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
		scnr.close();
		return menuChoice;
	}
	public static String menuTypeSelection(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("\nSelect person type to process(if any):\n");
		System.out.println("(F)aculty");
		System.out.println("(S)tudent");
		System.out.println("E(X)it\n");
		System.out.print("Choice: ");
		String type = scnr.nextLine().toUpperCase();
		scnr.close();
		return type;
	}
}
