package List;

import java.util.ArrayList;

public class GenericProg 
{
	@SuppressWarnings({ })
	public static void main(String[] args) 
	{
		ArrayList<Integer>a1 =new ArrayList<Integer>();
		a1.add(25);
		a1.add(28);
		a1.add(88);
		a1.add(null);
		//a1.add("Hi");  error only allow int 
		
		System.out.println(a1);
	}
}
