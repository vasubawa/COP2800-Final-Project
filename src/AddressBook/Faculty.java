package AddressBook;

public class Faculty extends Person {
	private String salary;
	private String title;

	public Faculty(String pName, int pAge, String pEmail, String pPhoneNum, String pAddress, int pID, String fSalary,
			String fTitle) {
		super(pName, pAge, pEmail, pPhoneNum, pAddress, pID);
		setSalary(fSalary);
		setTitle(fTitle);
	}

	public void setSalary(String fSalary) {
		this.salary = fSalary;
	}

	public String getSalary() {
		return salary;
	}

	public void setTitle(String fTitle) {
		this.title = fTitle;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		// super.toString();
		// System.out.print(", Salary: " + salary + ", Title: " + title);
		return super.toString() + ", Salary: " + getSalary() + ", Title: " + getTitle();
	}
}
