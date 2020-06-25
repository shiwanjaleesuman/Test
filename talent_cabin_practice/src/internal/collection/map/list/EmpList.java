/**
 * 
 */
package internal.collection.map.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Shiwanjalee
 *
 */
public class EmpList {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Emp("Ravi", "Trainee", 12000));
		list.add(new Emp("Amit", "Trainer", 32000));
		list.add(new Emp("Vipul", "Acct", 40000));
		
		list.add(1, new Emp("Sachin", "Mgr", 98000));
		list.add(3, new Emp("Anil", "DevOps", 45000));
		
		Iterator itr = list.iterator();
		System.out.println("List elements are: ");
		while(itr.hasNext())
		{
			Emp e = (Emp) itr.next();
			e.display();
		}
		
		System.out.println("Searching the element in the list: ");
		Emp e1 = new Emp("Vipul", "Acct", 40000);
		e1.display();
		if(list.contains(e1))
		{
			System.out.println("Found.");
		}
		else
		{
			System.out.println("Not found.");
		}
		
		System.out.println("removing the element from the list: ");
		Emp e2 = new Emp("Sachin", "Mgr", 98000);
		e1.display();
		if(list.remove(e2))
		{
			System.out.println("Removed.");
		}
		else
		{
			System.out.println("Not Removed.");
		}
	}
}
