package AddressBook;

public class Student extends Person {

	private String id;

	public Student(String pName, int pAge, String pEmail, String pPhoneNum, String pAddress, int pID, String sID) {
		super(pName, pAge, pEmail, pPhoneNum, pAddress, pID);

		setStudentID(sID);
	}

	public void setStudentID(String sID) {
		this.id = sID;
	}

	public String getStudentID() {
		return id;
	}

	public String toString() {
		// super.toString();
		// System.out.print(", Salary: " + salary + ", Title: " + title);
		return super.toString() + ", Student ID: " + getStudentID();
	}

}
