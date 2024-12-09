package encapsulation;

public class GetPinfromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User_WithdrawAmount obj=new User_WithdrawAmount();
		String p=obj.setpin("1212");
		obj.validatepin(p);
		obj.getpin();
	}

}
