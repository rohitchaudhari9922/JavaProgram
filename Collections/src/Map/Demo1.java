package Map;
import java.util.*;
public class Demo1 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> h1 =new HashMap<String,Integer>();
		h1.put("Mango",33);
		h1.put("Orange",12);
		h1.put("Hi",33);
		h1.put("Apple",62);
		h1.put(null,28);
		h1.put("Apple",88);
		h1.put("Oye",11);
		
		for(Map.Entry<String, Integer>m1 : h1.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}
}
