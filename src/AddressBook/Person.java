package AddressBook;

import java.util.*;

public class Person
{
	private int age;
	private String email;
	private String address;
	private String name;
	private String phoneNum;

	public Person(String pName, int pAge, String pEmail, String pPhoneNum, String pAddress) {
		this.name = pName;
		this.age = pAge;
		this.email = pEmail;
		this.phoneNum = pPhoneNum;
		this.address = pAddress;
    }

	public void setAddress(String pAddress){
		address = pAddress;
	}
    public void setAge(int pAge){
		if (age > 0) { 
			this.age = pAge; 
		}
	}
	public void setEmail(String pEmail){
		email = pEmail;
	}
	
	public void setName(String pName){
		name = pName;
	}
	public void setPhoneNum(String pPhoneNum){
		phoneNum = pPhoneNum;
	}
	
	public int getAge(){
		return age;
	}
	public String getEmail(){
		return email;
	}
	public String getAddress(){
		return address;
	}
	public String getName(){
		return name;
	}
	public String getPhoneNum(){
		return phoneNum;
	}

	public void printAll()
	{
		System.out.println(String.format(getName() + " " + getAge() + " " + getEmail() + " " + getPhoneNum() + " " + getAddress() ));
	}

	public void update()
	{
		System.out.println(String.format("old value of Name : %1$s, please enter new value !", getName()));
		setName((new Scanner(System.in).nextLine()));
		System.out.println(String.format("old value of Age : %1$s, please enter new value !", getAge()));
		setAge(Integer.parseInt(new Scanner(System.in).nextLine()));
	}
}
