package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		ArrayList hero = new ArrayList();
		hero.add("Samba");
		hero.add("Dinga");
		hero.add("Bunga");
		
		ArrayList heroin =new ArrayList();
		heroin.add("Sambi");
		heroin.add("Dingi");
		heroin.add("Bungi");
		
		ArrayList film =new ArrayList();
		film.add("Thakur");
		film.addAll(hero);
		film.addAll(heroin);
		
		Iterator it = film.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----------------");
		System.out.println(film.contains("Samba"));
		System.out.println(film.containsAll(heroin));
		
		film.remove("Dinga");
		System.out.println(film.contains("Dinga"));
		System.out.println(hero.contains("Dinga"));
		
		film.removeAll(heroin);
		System.out.println(film.contains("Dingi"));
		System.out.println(film.containsAll(heroin));
		
		System.out.println("------------------");
		
		it =film.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
