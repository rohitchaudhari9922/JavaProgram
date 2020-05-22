package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHastSetDemo 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		LinkedHashSet l1 =new LinkedHashSet();
		l1.add(44);
		l1.add("Hi");
		l1.add(null);
		l1.add('A');
		l1.add(6.2);
		l1.add(88);
		
		Iterator it =l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
