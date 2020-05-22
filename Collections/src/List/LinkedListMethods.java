package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		LinkedList l1 =new LinkedList();
		l1.add(22);
		l1.add(4.5);
		l1.add('A');
		l1.add(null);
		l1.add(22);
		l1.add("Hi");
		
		Iterator it =l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----------------------------");
		
		System.out.println(l1);
		
		l1.addFirst("First");
		l1.addLast("Last");
		System.out.println(l1);
		
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		l1.offerFirst("Start");
		l1.offerLast("End");
		System.out.println(l1);
		
		System.out.println("-----------------------------");
		
		System.out.println(l1.poll());
		System.out.println(l1);
		
		System.out.println(l1.peek());
		System.out.println(l1);
		
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		
		System.out.println(l1.peekFirst());
		System.out.println(l1);
		
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		System.out.println(l1.peekLast());
		System.out.println(l1);
	}
}
