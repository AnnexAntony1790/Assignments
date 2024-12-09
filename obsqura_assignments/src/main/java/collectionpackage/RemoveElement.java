package collectionpackage;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Violet");
		obj.add("Indigo");
		obj.add("Blue");
		obj.add("Green");
		obj.add("Yellow");
		obj.add("Orange");
		obj.add("Red");
		System.out.println("Colors:"+obj);
		obj.remove(2);
		System.out.println("After Removing 3rd Element:"+obj);

	}

}
