/**
 * 
 */
package internal.date_06_12.sim;

/**
 * @author Shiwanjalee
 *
 */
public class Airtel implements Sim
{

	@Override
	public int call() 
	{
		return 1;
	}

	@Override
	public int msg() {
		return 1;
	}

	@Override
	public int data() {
		return 1;
	}
}
