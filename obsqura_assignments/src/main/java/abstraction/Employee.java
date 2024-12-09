package abstraction;

public abstract class Employee {

	
	public abstract void calculatesalary(int hourlypay,int worktime);//abstract method
	
	public void calculatesalary()
	{
		int hour=8;
		int pay=200;
		int totalpayment=hour*pay;
		System.out.println("Total Payment of Fulltime Employee:"+totalpayment);
	}
	
}
