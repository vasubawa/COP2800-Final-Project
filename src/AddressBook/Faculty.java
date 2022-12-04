package AddressBook;

public class Faculty extends Person {
	private double salary;
	private String title;

	public Faculty(String pName, int pAge, String pEmail, String pPhoneNum, String pAddress, int pID, int fSalary,
			String fTitle) {
		super(pName, pAge, pEmail, pPhoneNum, pAddress, pID);

		this.salary = fSalary;
		this.title = fTitle;
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
