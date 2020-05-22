package List;

import java.util.ArrayList;
import java.util.Collections;

public class UtilityClass 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(33);
		a1.add(21);
		a1.add(33);
		a1.add(55);
		a1.add(88);
		a1.add(33);
		a1.add(10);
		a1.add(66);
		
		System.out.println(a1);
		
		System.out.println(Collections.frequency(a1, 33));
		
		System.out.println(Collections.max(a1));
		System.out.println(Collections.min(a1));
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		
		Collections.reverse(a1);
		System.out.println(a1);
		
		Collections.swap(a1, 1, 2);
		System.out.println(a1);
		
		Collections.shuffle(a1);
		System.out.println(a1);
		
		Collections.replaceAll(a1, 33, 0);
		System.out.println(a1);
	}
}
