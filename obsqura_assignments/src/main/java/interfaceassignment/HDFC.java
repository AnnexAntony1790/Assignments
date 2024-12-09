package interfaceassignment;
public class HDFC implements RBIInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj=new HDFC();
		double MaturityAmount=obj.recurringDeposit(10000, 9);
		System.out.println("Maturity Amount:"+MaturityAmount);
	}

	@Override
	public double recurringDeposit(double p, double n) {
		// TODO Auto-generated method stub
				
	 double totalDeposit = p * n; // Total amount deposited
	 System.out.println("Total Amount Deposited:"+totalDeposit);
	 double SI = (p * n * (n + 1) / 2) * (r / (12 * 100));
	 System.out.println("Simple Interest:"+SI);
	 double Maturity= totalDeposit + SI;
	 return Maturity;
	}
}
