package Map;

import java.util.*;
public class TreeMapDemo 
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
		
		for(Map.Entry<Integer, String> m1 : h1.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}
}
