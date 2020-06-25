/**
 * 
 */
package internal.collection.map.treeCollection;

import java.util.HashSet;
import java.util.Iterator;

import internal.collection.map.hashCollection.Emp;

/**
 * @author Shiwanjalee
 *
 */
public class EmpTreeBasedCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		HashSet ts = new HashSet();
		ts.add(new Emp("Ravi", "Trainee", 12000));
		ts.add(new Emp("Amit", "Trainer", 32000));
		ts.add(new Emp("Vipul", "Acct", 40000));
		
		ts.add(new Emp("Sachin", "Mgr", 98000));
		ts.add(new Emp("Anil", "DevOps", 45000));
		
		Iterator itr = ts.iterator();
		System.out.println("Set elements are: ");
		while(itr.hasNext())
		{
			Emp e = (Emp) itr.next();
			e.display();
		}
		
		System.out.println("Searching the element in the list: ");
		Emp e1 = new Emp("Vipul", "Acct", 40000);
		e1.display();
		if(ts.contains(e1))
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
		if(ts.remove(e2))
		{
			System.out.println("Removed.");
		}
		else
		{
			System.out.println("Not Removed.");
		}
		
	}

}
