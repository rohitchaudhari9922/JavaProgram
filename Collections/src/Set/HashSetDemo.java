package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		HashSet s1 = new HashSet();
		s1.add(44);
		s1.add("Hi");
		s1.add(null);
		s1.add(44);
		s1.add('A');
		s1.add(6.2);
		s1.add(44);
		s1.add(44);		//Duplicates not allowed
		
		System.out.println(s1);
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.contains(44));
		System.out.println(s1.size());
		s1.remove(44);
		
		System.out.println(s1);
		
		System.out.println("-----------------------");
		
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------");
		s1.clear();
		System.out.println(s1);
	}
}
