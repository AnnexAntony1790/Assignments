package inheritance;

public class CalculatePay extends GetSalaryDetails{

	
	public int calcpay(int basicpay)
	{
		//calc hra=5% of basic pay
		int hra=(5*basicpay)/100;
		//System.out.println("Hra:"+hra);
		return hra;
		
	}
	public int calcpf(int basicpay)
	{
		int pf=(20*basicpay)/100;
		//System.out.println("Pf:"+pf);
		return pf;
	}
	
	
}
