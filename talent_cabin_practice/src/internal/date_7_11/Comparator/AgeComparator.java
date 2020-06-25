/**
 * 
 */
package internal.date_7_11.Comparator;

import java.util.Comparator;

/**
 * @author OneStop
 *
 */
public class AgeComparator implements Comparator
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if(s1.age==s2.age)
		{
			return 0;
		}
		else if (s1.age>s2.age) 
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

}
