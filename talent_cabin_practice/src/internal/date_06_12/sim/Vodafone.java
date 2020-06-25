/**
 * 
 */
package internal.date_06_12.sim;

/**
 * @author Shiwanjalee
 *
 */
public class Vodafone implements Sim
{

	@Override
	public int call() {
		return 2;
	}

	@Override
	public int msg() {
		return 2;
	}

	@Override
	public int data() {
		return 2;
	}
}
