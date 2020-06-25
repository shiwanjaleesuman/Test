/**
 * 
 */
package internal.date_7_11.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author OneStop
 *
 */
public class DeQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<String> dequeue = new ArrayDeque<String>();
		dequeue.add("Giet");
		dequeue.add("Bhubnesh-Giet");
		dequeue.add("Dps");
		dequeue.add("Vijaya");
		dequeue.add("");
		dequeue.add("AP");
		dequeue.remove();
		dequeue.add("Vijaya");
		
		for(String str: dequeue)
		{
			System.out.println("DeQueue objects: "+str);
		}
	}
}
