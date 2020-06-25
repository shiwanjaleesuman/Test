/**
 * 
 */
package internal.date_02_12.syncronization.memory;

import internal.date_02_12.syncronization.producer_consumer.Buffer;
import internal.date_02_12.syncronization.producer_consumer.Consumer;
import internal.date_02_12.syncronization.producer_consumer.Producer;

/**
 * @author Shiwanjalee
 *
 */
public class MemoryTest {

	/**
	 * Synchronized Thread for writing and then reading the wriiten context from it.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Memory mt = new Memory();

		ReadMemory read = new ReadMemory(mt);
		WriteMemory write = new WriteMemory(mt);
		read.start();
		write.start();
	}

}
