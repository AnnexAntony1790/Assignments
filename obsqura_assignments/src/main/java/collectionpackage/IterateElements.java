package collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateElements {

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
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(obj);

	}

}
