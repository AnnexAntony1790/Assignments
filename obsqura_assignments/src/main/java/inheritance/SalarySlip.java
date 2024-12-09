package inheritance;

public class SalarySlip extends CalculatePay {

	//total salary=basicpay+hra-pf-deduction+bonus;
	
	public int gettotalsalary(int basicpay,int hra,int pf,int deduction,int bonus)
	{
		int totalsalary=basicpay+hra-pf-deduction+bonus;
		System.out.println("Total Salary:"+totalsalary);
		return totalsalary;
	}
	public void getsalaryslip(int basic_pay, int hra, int pf, int deduction,
			int bonus,int totalsalary) 
	{
		System.out.println("Basic Pay:"+basic_pay);
		System.out.println("Hra:"+hra);
		System.out.println("PF:"+pf);
		System.out.println("Deduction:"+deduction);
		System.out.println("Bonus:"+bonus);		
		System.out.println("Total Salary by hand:"+totalsalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalarySlip obj=new SalarySlip();
		int basic_pay=obj.getbasicpay(100000);
		int deduction=obj.getdeduction(500);
		int bonus=obj.getbonus(5000);
		int hra=obj.calcpay(basic_pay);
		int pf=obj.calcpf(basic_pay);
		int total_salary=obj.gettotalsalary(basic_pay, hra, pf, deduction, bonus);
		obj.getsalaryslip(basic_pay, hra, pf, deduction, bonus, total_salary);


	}

}
