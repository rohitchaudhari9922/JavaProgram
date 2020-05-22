package List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		Vector v1 =new Vector();
		v1.add(23);
		v1.add(4.5);
		v1.add(22);
		v1.add(null);
		v1.add('A');
		v1.add("Hi");
		
		System.out.println("Capacity : "+v1.capacity());
		System.out.println("Size :"+v1.size());
		
		v1.add(22);
		v1.add(null);
		v1.add('A');
		v1.add("Hi");
		
		System.out.println("Capacity :"+v1.capacity());
		System.out.println("Size: "+v1.size());
		
		v1.add(76);
		
		System.out.println("Capacity :"+v1.capacity());
		System.out.println("Size: "+v1.size());
		
		System.out.println("------------");
		
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}
}
