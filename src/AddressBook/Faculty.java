package AddressBook;

import java.util.*;

public class Faculty extends Person
{
	private double Salary;




	public final void setSalary(double value)
	{
		Salary = value;
	}
	public final double getSalary()
	{
		return Salary;
	}

	public Faculty(String _PhoneNum)
	{
		super(_PhoneNum);
		System.out.println("Enter Faculty's Salary:");
		setSalary(Double.parseDouble(new Scanner(System.in).nextLine()));
	}
	@Override
	public void Update()
	{
		System.out.println("Updating Faculty Details");
		super.Update();
		System.out.println(String.format("old value of Salary : %1$s, please enter new value !", getSalary()));
		setSalary(Double.parseDouble(new Scanner(System.in).nextLine()));
	}
	@Override
	public void Print()
	{
		System.out.println("Printing Faculty Details");
		super.Print();
		System.out.println(String.format("Salary: %1$s", getSalary()));
	}

}
