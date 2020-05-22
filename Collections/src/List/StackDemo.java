package List;

import java.util.Stack;

public class StackDemo 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		Stack s1 =new Stack();
		s1.push(45);
		s1.push(5.5);
		s1.push(null);
		s1.push("Hi");
		s1.push(5.5);
		s1.push('A');
		
		System.out.println(s1);
		
		System.out.println(s1.peek());
		System.out.println(s1);
		
		System.out.println("----------------------------");
		
		System.out.println(s1.pop());
		System.out.println(s1);
		
		System.out.println(s1.pop());
		System.out.println(s1);
	}
}
