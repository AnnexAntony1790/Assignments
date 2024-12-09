package polymorphism;

public class OnSeason extends OffSeason{

	public void discount(int price)
	{
		super.discount(3000);
		int discount=(price*40)/100;
		int final_price=price-discount;	
		System.out.println("Total Price:"+price+",with 15% discount\n"+"Discount:"+discount);
		System.out.println("OnSeason Price after discount:"+final_price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnSeason obj=new OnSeason();
		obj.discount(2000);
	}

}
