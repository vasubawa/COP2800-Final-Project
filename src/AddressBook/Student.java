package AddressBook;

import java.util.*;

public class Student extends Person
{

	public Student(String fullName, int age, String email, int phoneNum, String address, int sID, float sGPA) {
		
	}
	public final int getClass()
	{
		return Class;
	}
	public final void setClass(int value)
	{
		Class = value;
	}
	public Student(String _PhoneNum)
	{
		super(_PhoneNum);
		System.out.println("Enter Student's Class :");
		setClass(Integer.parseInt(new Scanner(System.in).nextLine()));
	}
	
	@Override
	public void Print()
	{
		System.out.println("Printing Student Details");
		super.Print();
		System.out.println(String.format("Class: %1$s", getClass()));
	}
	@Override
	public void Update()
	{
		System.out.println("Updating Student Details");
		super.Update();
		System.out.println(String.format("old value of Class : %1$s, please enter new value !", getClass()));
		setClass(Integer.parseInt(new Scanner(System.in).nextLine()));

	}
}