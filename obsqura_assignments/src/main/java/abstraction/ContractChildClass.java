package abstraction;

public class ContractChildClass extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContractChildClass obj=new ContractChildClass();
		obj.calculatesalary();
		obj.calculatesalary(150,7);
	}

	@Override
	public void calculatesalary(int hourlypay,int worktime) {
		// TODO Auto-generated method stub
		int totalpayment=hourlypay*worktime;
		System.out.println("Total payment of an employee: "+totalpayment);
	}

}
