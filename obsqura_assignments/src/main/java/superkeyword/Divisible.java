package superkeyword;

public class Divisible extends Addition{
	
public void isdivisible()
{
	int x=super.additionresult(20, 30);
	if((x%10==0))
			{
		System.out.println(x+" is divisible by 10");
			}
	else
	{
		System.out.println(x+" is not divisible by 10");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Divisible obj=new Divisible();
		obj.isdivisible();
		
	}

}
