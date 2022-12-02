package AddressBook;

import java.util.*;

public class Person
{
	private int age;
	private String email;
	private String address;
	private String name;
	private int phoneNum;


	public Person(int age, String userEmail, String userAddress, String userName, int userPhoneNum){
		setAge(-1);
		setEmail("Unknown");
		setAddress("Unknown");
		setName("Unknown");
		setPhoneNum(-1);
	}

	public void setAge(int userAge){
		if (age > 0) { 
			this.age = userAge; 
		}
	}
	public void setEmail(String userEmail){
		email = userEmail;
	}
	public void setAddress(String userAddress){
		address = userAddress;
	}
	public void setName(String userName){
		name = userName;
	}
	public void setPhoneNum(int userPhoneNum){
		phoneNum = userPhoneNum;
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
	public int getPhoneNum(){
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
