package inheritance;

public class SingleChild extends SingleParent{
	public void print()
	{
		String a="Annex";
		String b="Antony";
		System.out.print(a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SingleChild obj=new SingleChild();
		
		obj.display();
		obj.print();
	}

}
