/**
 * 
 */
package internal.date_7_11.collections.list.stack;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author OneStop
 *
 */
public class StackTest {

	/**
	 * @param An example showing collection-Stack example
	 */
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Giet");
		st.push("Bhubnesh-Giet");
		st.push("Dps");
		st.push("Vijaya");
		st.push("CV raman");
		st.pop();
		st.push("AP");
		st.push("Vijaya");
		
		Iterator<String> itr = st.iterator();
		while(itr.hasNext())
		{
			System.out.println("Vector Object list: "+ itr.next());
		}

	}

}
