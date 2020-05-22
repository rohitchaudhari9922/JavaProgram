
//Diff ways of retrieving elements of map object
package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h1 =new HashMap<Integer,String>();
		h1.put(33, "Mango");
		h1.put(12, "Orange");
		h1.put(33, "Hi");
		h1.put(62, "Apple");
		h1.put(28, null);
		h1.put(88, "Apple");
		h1.put(11, "Oye");
		
		for(Map.Entry<Integer,String>m1 : h1.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
		System.out.println("--------------------------------");
		
		Iterator it = h1.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry m1 = (Entry) it.next(); 
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
		System.out.println("-----------------");
		for(int i : h1.keySet())
		{
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		for(String s : h1.values())
		{
			System.out.println(s);
		}
		
		System.out.println("-------------------");
		//modified code
		for(int i : h1.keySet())
		{
			System.out.println(i+" "+h1.get(i));
		}
	}
}
