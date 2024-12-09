package polymorphism;

public class OffSeason {

	public void discount(int price)
	{
		int discount=(price*15)/100;
		int final_price=price-discount;	
		System.out.println("Total Price:"+price+",with 40% disount\n"+"Discount:"+discount);
		System.out.println("OffSeason Price after discount:"+final_price+"\n");
	}

}
