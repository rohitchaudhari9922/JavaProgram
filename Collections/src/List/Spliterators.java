package List;

import java.util.ArrayList;
import java.util.Spliterator;

public class Spliterators 
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
		
		Spliterator s1 =a1.spliterator();
		s1.forEachRemaining(System.out::println);
	}
}
