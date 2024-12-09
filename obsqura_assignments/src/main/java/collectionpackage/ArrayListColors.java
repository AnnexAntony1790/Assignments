package collectionpackage;

import java.util.ArrayList;

public class ArrayListColors {

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
		
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.addAll(obj);
		System.out.println("Colors:"+obj1);
		
		

	}

}
