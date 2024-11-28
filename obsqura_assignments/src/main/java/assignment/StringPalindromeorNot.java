package assignment;

public class StringPalindromeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindromeorNot obj=new StringPalindromeorNot();
		obj.calcpalindrome("Java");
		obj.calcpalindrome("Malayalam");
	}
	public void calcpalindrome(String s)
	{
		int n=s.length()-1;//finding index length of string and  iterating from 3 to 0;
		String rev="";
		for(int i=n;i>=0;i--)
		{			
			rev=rev+s.charAt(i);
		}
		System.out.println(s+" after reverse:"+rev);
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}


}
