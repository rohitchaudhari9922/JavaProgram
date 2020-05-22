package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo 
{
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) 
	{
		TreeSet<String> s1 =new TreeSet<String>();
		s1.add("Mango");
		//s1.add(22);	Exception
		//s1.add(null);
		s1.add("Apple");
		s1.add("Orange");
		s1.add("44");
		s1.add("Mango");
		s1.add("BlueBerry");
		s1.add("22");
		s1.add("Grapes");
		
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("---------------------");
		
		Iterator<String> it1 = s1.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}
}
