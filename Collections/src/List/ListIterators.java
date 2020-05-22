package List;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterators 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		ArrayList a1 =new ArrayList();
		a1.add(25);
		a1.add(2.2);
		a1.add('A');
		a1.add(null);
		a1.add("Hi");
		a1.add(200);
		
		ListIterator l1 = a1.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		System.out.println("-------------------");
		
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
	}
}
