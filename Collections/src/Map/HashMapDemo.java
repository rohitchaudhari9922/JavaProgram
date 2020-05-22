package Map;

import java.util.HashMap;
import java.util.Map;
public class HashMapDemo 
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
		
		System.out.println("33: "+h1.get(33));
		System.out.println("Mango :"+h1.containsValue("Mango"));
		System.out.println("28: "+h1.containsKey(28));
		
		h1.remove(11);
		System.out.println("Oye: "+h1.containsValue("Oye"));
		
		System.out.println("------------------------");
		
		for(Map.Entry<Integer,String>m1 : h1.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
		System.out.println("-----------------");
		
		for(Map.Entry<Integer,String>m1 : h1.entrySet())
		{
			System.out.println(m1);
		}
		
		System.out.println("----------------------------------");
		System.out.println(h1);
		
		
	}
}
