package assignment;
public class ReverseUsingThis {	
	int n;
	int rev=0;	
	public ReverseUsingThis()
	{
		this(987654321);
		System.out.println("Finding Reverse...");
		System.out.println("Number before reverse:"+n);
		System.out.println("Number obtained after reverse:"+rev);
	}	
	public ReverseUsingThis(int n)
	{
	this.n=n;
	while(n!=0)
	{	
		int remainder=n%10;
		rev=rev*10+remainder;
		n=n/10;			
	}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseUsingThis obj=new ReverseUsingThis();
	}
}
