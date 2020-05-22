package List;

import java.util.ArrayList;

public class UsingForLoop 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		ArrayList a1 =new ArrayList();
		a1.add(25);
		a1.add(2.2);
		a1.add('A');
		a1.add(null);
		a1.add("Hi");
		a1.add(25);
		
		System.out.println(a1.get(2));
		System.out.println(a1.size());
		
		System.out.println("-------------");
		for(int i=0 ; i<=5; i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("-------------");
		for(int i=0; i<6 ;i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("-------------");
		for(int i=0 ; i<a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("--------------");
		
		//using for-each loop
		for(Object o1 : a1)
		{
			System.out.println(o1);
		}
		
	}
}
