package collectionpackage;

import java.util.ArrayList;

public class RetrievingElements {

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
		System.out.println("Collection of Colors:"+obj);
		
		System.out.println("Element at index 0:"+obj.get(0));
		System.out.println("Element at index 1:"+obj.get(1));
		System.out.println("Element at index 2:"+obj.get(2));
		System.out.println("Element at index 3:"+obj.get(3));
		System.out.println("Element at index 4:"+obj.get(4));
		System.out.println("Element at index 5:"+obj.get(5));
		System.out.println("Element at index 6:"+obj.get(6));

	}

}
