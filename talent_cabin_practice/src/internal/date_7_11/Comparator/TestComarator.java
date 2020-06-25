/**
 * 
 */
package internal.date_7_11.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author OneStop
 *
 */
public class TestComarator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(new Student(100, 20, "Vikash"));
		al.add(new Student(101, 22, "Jai"));
		al.add(new Student(102, 25, "Vijay"));
		al.add(new Student(103, 28, "Sai"));
		al.add(new Student(104, 18, "Ram"));
		
		System.out.println("Sorting by names: ");
		
		Collections.sort(al, new NameComparator());
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Student st = (Student) itr.next();
			System.out.println(st.roll+" "+st.name+" "+st.age);
		}
		
		System.out.println("Sorting by age");
		
		Collections.sort
		
		

	}

}
