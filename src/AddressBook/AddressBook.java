package AddressBook;

import java.util.*;

public class AddressBook
{
	public static void main(String[] args)
	{
		ArrayList<Person> people = new ArrayList<Person>();
		char menuTypeChoice = ' ';
		char menuOperationChoice = ' ';
		do
		{
			Person temp = null;
			menuOperationChoice = menuOperationSelection();
			do
			{
				menuTypeChoice = menuTypeSelection();
				switch (menuTypeChoice)
				{
					case 'F':
						switch (menuOperationChoice)
						{
							case 'C':
								System.out.println(String.format("Creating faculty profile..."));
								System.out.println("Enter Mobile Number");
								String no = new Scanner(System.in).nextLine();
								if (tangible.ListHelper.find(people, p -> Objects.equals(p.PhoneNum, no)) == null)
								{
									temp = new Faculty(no);
									temp.Print();
									people.add(temp);
								}
								else
								{
									System.out.println("Mobile No Alreadyy Exist");
								}

								break;
							case 'R':
								System.out.println("Printing Faculties");
								for (var item : people)
								{
									item.Print();
								}
								break;
							case 'U':
								System.out.println("Select Faculty by PhoneNo");
								for (var item : people)
								{
									item.Print();
								}
								no = new Scanner(System.in).nextLine();
								Person person = tangible.ListHelper.find(people, p -> Objects.equals(p.PhoneNum, no));
								person.Update();
								break;
							case 'D':
								System.out.println("Select Faculty by PhoneNo");
								for (var item : people)
								{
									item.Print();
								}
								no = new Scanner(System.in).nextLine();
								person = tangible.ListHelper.find(people, p -> Objects.equals(p.PhoneNum, no));
								people.remove(person);
								break;
							default:
								break;
						}
						break;
					case 'S':
						switch (menuOperationChoice)
						{
							case 'C':
								System.out.println(String.format("Creating student profile\n"));

								System.out.println("Enter Mobile Number");
								String no = new Scanner(System.in).nextLine();
								if (tangible.ListHelper.find(people, p -> Objects.equals(p.PhoneNum, no)) == null)
								{
									temp = new Student(no);
									temp.Print();
									people.add(temp);
								}
								else
								{
									System.out.println("Mobile No Alreadyy Exist");
								}
								break;
							case 'R':
								System.out.println("Printing Students");
								for (var item : people)
								{
									item.Print();
								}
								break;
							case 'U':
								System.out.println(String.format("%1$s for %2$s", menuOperationChoice, menuTypeChoice));
								break;
							case 'D':
								System.out.println(String.format("%1$s for %2$s", menuOperationChoice, menuTypeChoice));
								break;
							default:
								break;
						}
						break;
					default:
						break;
				}
			} while (menuTypeChoice != 'X');

		} while (menuOperationChoice != 'X');
		System.out.println("\nThank you for using Team 2's Address Book! Good-bye!");
	}


	private static char menuOperationSelection()
	{
		System.out.println("\nAddressBook Menu\n");
		System.out.println("(C)reate");
		System.out.println("(R)etrieve");
		System.out.println("(U)pdate");
		System.out.println("(D)elete");
		System.out.println("E(X)it\n");
		System.out.println("Choice: ");
		char scnr = (char)(new Scanner(System.in).nextLine().toUpperCase());
		return scnr;
	}
	private static String menuTypeSelection()
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("\nSelect person type to process\n");
		System.out.println("(F)aculty");
		System.out.println("(S)tudent");
		System.out.println("E(X)it\n");
		System.out.println("Choice: ");
		String choice = scnr.nextLine();
		return choice;
	}
}
