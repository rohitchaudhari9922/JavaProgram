package List;

import java.util.Vector;

public class VectorLegacy 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add(25);
		v1.add(22);
		v1.add(25);
		v1.add(null);
		
		v1.addElement(45);
		System.out.println(v1.capacity());		//legacy method
		System.out.println(v1.elementAt(3));	//legacy method
		System.out.println(v1.firstElement());	//legacy method
		System.out.println(v1.lastElement());	//legacy method
		
		System.out.println(v1);
		
		v1.add(3,88);
		System.out.println(v1);
		
		v1.insertElementAt(99, 4);				//legacy method
		System.out.println(v1);
	
		v1.set(5, 11);
		System.out.println(v1);
		
		v1.setElementAt(44, 5);					//legacy method
		System.out.println(v1);
		
		v1.remove(3);
		System.out.println(v1);
		
		v1.removeElement(99);					//legacy method
		System.out.println(v1);
		
		v1.removeAllElements();					//legacy method
		System.out.println(v1);
	}
}
