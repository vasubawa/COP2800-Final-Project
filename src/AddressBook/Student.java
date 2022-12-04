package AddressBook;

public class Student extends Person {

	private float gpa;

	public Student(String pName, int pAge, String pEmail, String pPhoneNum, String pAddress, int pID, float sGPA) {
		super(pName, pAge, pEmail, pPhoneNum, pAddress, pID);

		setStudentGPA(sGPA);
	}

	public void setStudentGPA(float sGPA) {
		this.gpa = sGPA;
	}

	public float getStudentGPA() {
		return gpa;
	}

	public String toString() {
		// super.toString();
		// System.out.print(", Salary: " + salary + ", Title: " + title);
		return super.toString() + ", Student ID: " + getStudentID();
	}

}
