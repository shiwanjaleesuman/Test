/**
 * 
 */
package test;

/**
 * @author OneStop
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String name = "Atul";
		int a = 10;
		int b= 20;
		int c= a+b;
		int d = 0;
		try {
			d = c/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println(d +" "+name);
		}
		
	}

}
