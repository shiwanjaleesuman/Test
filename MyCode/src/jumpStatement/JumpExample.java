/**
 * 
 */
package jumpStatement;

/**
 * @author OneStop
 *
 */
public class JumpExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n=5, result=1;
		System.out.println("Table of 5 is : ");
		for(int i=1; i<10; i++)
		{
			result = n*i;
			if(result > 20)
			{
				break;
			}
			System.out.println(n +" X "+i+ " = "+result);
		}

	}

}
