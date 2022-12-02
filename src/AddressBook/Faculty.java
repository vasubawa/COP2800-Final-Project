package AddressBook;

import java.util.*;

public class Faculty extends Person
{
	public Faculty(String pName, int pAge, String pEmail, String pPhoneNum, String pAddress) {
		super(pName, pAge, pEmail, pPhoneNum, pAddress);
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
