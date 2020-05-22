package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		pq.add(22);
		pq.add(56);
		pq.add(12);
		pq.add(22);
		pq.add(28);
		pq.add(88);
		
		Iterator<Integer> it =pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		
		System.out.println(pq.peek());
		pq.poll();
		
		System.out.println("----------------------");
		
		it =pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		
		System.out.println(pq.peek());
		pq.poll();
		
		System.out.println("---------------------");
		
		it =pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		
		System.out.println(pq.peek());
		pq.poll();
		
	}
}
