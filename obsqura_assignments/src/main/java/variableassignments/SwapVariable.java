package variableassignments;

public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y=7;
		System.out.println("value of x before swap:"+x+" and value of y before swap:"+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("value of x after swap:"+x+" and value of y after swap:"+y);
		
	}

}
