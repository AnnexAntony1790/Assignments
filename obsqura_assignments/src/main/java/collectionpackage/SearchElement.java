package collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class SearchElement {

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
		
		System.out.println("Searching for Color Green...");
		
		if(obj.contains("Green"))
				{
			System.out.println("Element Green found at index:"+obj.indexOf("Green"));
				}
		else
		{
			System.out.println("Element not present");
		}
	
			}

}
