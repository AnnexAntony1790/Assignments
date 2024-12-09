package encapsulation;

public class User_WithdrawAmount {

	String pin_no;
	String validpins[] = { "1001", "1234", "1212" };

	public String setpin(String pin_no) {
		this.pin_no = pin_no;
		return pin_no;
	}

	public boolean validatepin(String p) {
		for (String i : validpins) {
			if (p == i) {
				System.out.println("You entered valid pin");
				return true;
			}
		}
		System.out.println("You entered invalid pin");
		return false;

	}

	public void getpin() {
		System.out.println("Pin_number:" + pin_no);
		
	}

}
