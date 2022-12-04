package AddressBook;

public class Student extends Person {

	private float id;

	public Student(String pName, int pAge, String pEmail, String pPhoneNum, String pAddress, int pID, float sGPA) {
		super(pName, pAge, pEmail, pPhoneNum, pAddress, pID);

		setStudentID(sGPA);
	}

	public void setStudentID(float sID) {
		this.id = sID;
	}

	public float getStudentID() {
		return id;
	}

	public String toString() {
		// super.toString();
		// System.out.print(", Salary: " + salary + ", Title: " + title);
		return super.toString() + ", Student ID: " + getStudentID();
	}

}
