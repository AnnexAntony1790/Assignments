package assignment;

public class FindFactorial {
		
	public void calcfactorial(int n)
	{
		System.out.println("Calculating Factorial");
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		this.printresult(fact,n);
	}
	public void printresult(int fact,int n)
	{		
		System.out.println("Factorial of number "+n+" is "+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFactorial obj=new FindFactorial();
		obj.calcfactorial(5);
	}

}
