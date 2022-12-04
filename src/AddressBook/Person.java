package AddressBook;

public class Person {
	/**
	 * This class contains all information that the user is prompted to input for
	 * the person type.
	 *
	 * @para String and intergers.
	 * @return Input taken by user
	 */
	// Declared variables.
	private int age;
	private String email;
	private String address;
	private String name;
	private String phoneNum;
	private int ID;

	public Person() {
		/**
		 * This method allows the user to input data such as name, age, phone number,
		 * address, email, ID.
		 *
		 * @return The inputs taken from the user.
		 */
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

	public Person(String pName, int pAge, String pEmail, int pPhoneNum, String pAddress, int pID) {
	}

	public void setAddress(String pAddress) {
		this.address = pAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAge(int pAge) {
		this.age = pAge;

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

	public void setID(int pID) {
		this.ID = pID;
	}

	public int getID() {
		return ID;
	}

	public void setName(String pName) {
		this.name = pName;
	}

	public String getName() {
		return name;
	}

	public void setPhoneNum(String pPhoneNum) {
		this.phoneNum = pPhoneNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String toString() {
		return "ID: " + getID() + ", Name: " + getName() + ", Age: " + getAge() + ", Email: " + getEmail()
				+ ", PhoneNumber: " + getPhoneNum() + ", Address: " + getAddress();
	}

}
