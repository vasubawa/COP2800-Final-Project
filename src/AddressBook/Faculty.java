package AddressBook;

public class Faculty extends Person
{
	public Faculty(String pName, int pAge, String pEmail, long pPhoneNum, String pAddress) {
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
