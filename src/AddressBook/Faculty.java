package AddressBook;

public class Faculty extends Person {
	/**
	 * This class allows the user to input the salary information when faculty type
	 * is selected when creating a new person in the address book.
	 **/
	private double salary;
	private String title;

	public Faculty() {
		this(-1, "Unknown");
	}

	public Faculty(double fSalary, String fTitle) {

	}

	public void setSalary(double fSalary) {
		salary = fSalary;
	}

	public double getSalary() {
		return salary;
	}

	public void setTitle(String fTitle) {
		title = fTitle;
	}

	public double getTitle() {
		return salary;
	}

	public void printAll() {
		super.toString();
		System.out.print(", Salary: " + salary + ", Title: " + title);
	}
}
