package aggregation;

public class Address {
	String address;
	Student ref;

	public Address(String address, Student ref) {
		this.address = address;
		this.ref = ref;
	}

	public void display() {
		System.out.println("Student name:" + ref.studentname + "\n" + "Rollno:" + ref.rollno);
		System.out.println("Address:" + address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student("Anu", 8);
		Address obj1 = new Address("Kapukat House,Padannakkad PO,Kasargod.", obj);
		obj1.display();

	}

}
