package AddressBook;

import java.util.*;

public class Person{

	private int age;
	private String email;
	private String address;
	private String name;
	private String phoneNum;

	public Person(){
		this("Unknown", -1, "Unknown", "Unknown", "Unknown");
	}
	public Person(String pName, int pAge, String pEmail, String pPhoneNum, String pAddress) {
		setName(pName);
		setAge(pAge);
		setEmail(pEmail);
		setPhoneNum(pPhoneNum);
		setAddress(pAddress);
    }

	public void setAddress(String pAddress){
		address = pAddress;
	}
	public String getAddress(){
		return address;
	}

    public void setAge(int pAge){
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

		// if both character exist
		if (index1 != -1 && index2 != -1) {
			// check character '@' before '.'
			if (index1 < index2) {
				ret = true;
			}
		}
		return (ret);
	}
	
	public void setEmail(String pEmail) {
		this.email = pEmail;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setName(String pName){
		name = pName;
	}
	public String getName(){
		return name;
	}

	public void setPhoneNum(String pPhoneNum){
		phoneNum = pPhoneNum;
	}
	public String getPhoneNum(){
		return phoneNum;
	}
	
	
	
	

	@Override
	public String toString()
	{
		return "Person [Name:" + getName() + ", Age:" + getAge() + ", Email:" + getEmail() + ", Phone Number:" + getPhoneNum() + ", Home Address:" + getAddress() + "]";
	}
}

