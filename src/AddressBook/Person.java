package AddressBook;

public class Person {
	/**
	 * This class allows the user to enter and stores information for each person
	 * including age, email, address, name, phone number, ID.
	 * 
	 * @param A String array
	 * @return A String representing a person's age, email, address, name, phone
	 *         number, and ID.
	 */
	// Declared variables.
	private int age;
	private String email;
	private String address;
	private String name;
	private String phoneNum;
	private int ID;

	public Person() {
		this("Unknown", -1, "Unknown", "Unknown", "Unknown", -1);
	}

	public Person(String pName, int pAge, String pEmail, String pPhoneNum, String pAddress, int pID) {
		setName(pName);
		setAge(pAge);
		setEmail(pEmail);
		setPhoneNum(pPhoneNum);
		setAddress(pAddress);
		setID(pID);
	}

	public void setAddress(String pAddress) {
		address = pAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAge(int pAge) {
		if (age > 0) {
			this.age = pAge;
		}
	}

	public int getAge() {
		return age;
	}

	public static boolean checkEmail(String pEmail) {
		boolean ret = false;

		// get index of '@' and last '.'
		int index1 = pEmail.indexOf('@');
		int index2 = pEmail.lastIndexOf('.');

		// Checks if both character exist
		if (index1 != -1 && index2 != -1) {
			if (index1 < index2) {
				ret = true;
			}
		}
		return (ret);
	}

	public void setEmail(String pEmail) {
		this.email = pEmail;
	}

	public String getEmail() {
		return email;
	}

	public static void checkID(String pID) {

	}

	public void setID(int pID) {
		this.ID = pID;
	}

	public int getID() {
		return ID;
	}

	public void setName(String pName) {
		name = pName;
	}

	public String getName() {
		return name;
	}

	public void setPhoneNum(String pPhoneNum) {
		phoneNum = pPhoneNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String toString() {
		// return getName() + "\t" + getAge() + "\t" + getEmail() + "\t" + getPhoneNum()
		// + "\t" + getAddress();
		return "ID: " + getID() + ", Name: " + getName() + ", Age: " + getAge() + ", Email: " + getEmail()
				+ ", PhoneNumber: " + getPhoneNum() + ", Address: " + getAddress();
	}

}
