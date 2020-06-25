/**
 * 
 */
package internal.date_7_11.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author OneStop
 *
 */
public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Giet");
		queue.add("Bhubnesh-Giet");
		queue.add("Dps");
		queue.add("Vijaya");
		queue.add("");
		queue.add("AP");
		queue.add("Vijaya");
		
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext())
		{
			System.out.println("Queue objects:"+itr.next());
		}
	}
}
