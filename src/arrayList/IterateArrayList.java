package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(5);
		System.out.println(list.size());
		System.out.println("*********while loop***********");
		Iterator i = list.iterator();
		while(i.hasNext()==true)
		{
			int element = (int) i.next();
			System.out.println(element);

		}
		System.out.println("*************for loop*************");
		for(int j =0 ;j<list.size();j++)
		{
			System.out.println(list.get(j));
		}
		System.out.println("******************Advance for Loop***********");
		for(Object obj : list)
		{
			System.out.println(obj);
		}
	}

}
