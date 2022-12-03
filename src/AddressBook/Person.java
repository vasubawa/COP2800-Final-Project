package AddressBook;

import java.util.ArrayList;

public class Person {

	private int age;
	private String email;
	private String address;
	private String name;
	private long phoneNum;
	private int ID;

	public Person() {
		this("Unknown", -1, "Unknown", -1, "Unknown", -1);
	}

	public Person(String pName, int pAge, String pEmail, long pPhoneNum, String pAddress, int pID) {
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

	public void setPhoneNum(long pPhoneNum) {
		phoneNum = pPhoneNum;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	@Override
	public String toString() {
		// return getName() + "\t" + getAge() + "\t" + getEmail() + "\t" + getPhoneNum()
		// + "\t" + getAddress();
		return "ID: " + getID() + ", Name: " + getName() + ", Age: " + getAge() + ", Email: " + getEmail()
				+ ", PhoneNumber: " + getPhoneNum() + ", Address: " + getAddress();
	}

}
