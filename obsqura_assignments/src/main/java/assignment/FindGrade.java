package assignment;

public class FindGrade {
	
	int sub1;int sub2;int sub3;
	String student;
		
	public FindGrade(int sub1,int sub2,int sub3,String Student)
	{		
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.student=Student;
		System.out.println("Finding grade of "+Student);
	}
	
	public int getgrade()
	{
		int total=sub1+sub2+sub3;
		
		return total;
		
	}
	
	public void displaygrade(int t)
	{
		int totalmarks=300;
		int percentage=(t*100)/totalmarks;
		
		if(percentage>80 && percentage<=100)
		{
			System.out.println("Student got A grade");
		}
		else if(percentage>70 && percentage<=80)
		{
			System.out.println("Student got B grade");
		}
		else if(percentage>60 && percentage<=70)
		{
			System.out.println("Student got C grade");
		}
		else if(percentage>=40 && percentage<=60)
		{
			System.out.println("Student got D grade");
		}
		else
		{
			System.out.println("Student failed");
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindGrade obj=new FindGrade(72, 70, 70,"Student1");
		int total=obj.getgrade();
		System.out.println("Total marks obtained:"+total);
		obj.displaygrade(total);
		FindGrade obj1=new FindGrade(72, 90, 90,"Student2");
		int total1=obj1.getgrade();
		System.out.println("Total marks obtained:"+total1);
		obj1.displaygrade(total1);
		
	
	}
	

}
