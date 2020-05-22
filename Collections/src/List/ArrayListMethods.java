package List;

import java.util.ArrayList;

public class ArrayListMethods 
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
		a1.add(25);
		
		System.out.println("isEmpty?: "+a1.isEmpty());
		System.out.println("Size :"+a1.size());
		System.out.println("Contains: "+a1.contains(25));
		
		System.out.println(a1);
		
		a1.add(2,"oye");
		System.out.println(a1);
		
		a1.remove(2);
		System.out.println(a1);
		
		a1.set(3, 57);
		System.out.println(a1);
		
		a1.clear();
		System.out.println(a1);
		
		
		a1.add(33);
		a1.add("B");
		a1.add(2.4);
		System.out.println(a1);
		
		a1.trimToSize();
	}
}
