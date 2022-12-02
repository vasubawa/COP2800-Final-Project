package AddressBook;

import java.util.*;

public class Faculty extends Person
{
	public Faculty(int age, String userEmail, String userAddress, String userName, int userPhoneNum) {
		super(age, userEmail, userAddress, userName, userPhoneNum);
		//TODO Auto-generated constructor stub
	}
	private double Salary;




	public final void setSalary(double value)
	{
		Salary = value;
	}
	public final double getSalary()
	{
		return Salary;
	}


}
