package assignment;

public class FindAverage {

	public void average(int n1,int n2,int n3)
	{
		int intaverage=(n1+n2+n3)/3;
		System.out.println("Average of given int numbers :"+intaverage);
		
	}
	public void average(float f1,float f2,float f3)
	{
		float floataverage=(f1+f2+f3)/3;
		System.out.println("Average of given float numbers :"+floataverage);
		
	}
	public void area(int r,float pi)
	{
		float area=pi*r*r;
		System.out.println("Area of circle :"+area);
	}
	public void area(int l,int b)
	{
		int area=l*b;
		System.out.println("Area of rectangle :"+area);
	}
	public int area(int a)
	{
		int area=a*a;
		System.out.println("Area of square :"+area);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAverage obj=new FindAverage();
	    obj.average(8, 34, 4);
	    obj.average(3.1f, 3.2f, 3.3f);
	    obj.area(5);
	    obj.area(5, 3.14f);//pi=3.14
	    obj.area(5);
	}

}
