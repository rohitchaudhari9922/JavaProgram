package List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterators 
{	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String [] arg)
	{
		ArrayList a1 =new ArrayList();
		a1.add(25);
		a1.add(2.2);
		a1.add('A');
		a1.add(null);
		a1.add("Hi");
		a1.add(25);
		
		Iterator it =a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
