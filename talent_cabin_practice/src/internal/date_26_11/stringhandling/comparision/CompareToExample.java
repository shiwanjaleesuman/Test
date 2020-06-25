/**
 * 
 */
package internal.date_26_11.stringhandling.comparision;

/**
 * @author OneStop
 *
 */
public class CompareToExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String s1 = "Shivy";
		String s2 = "SHIVY";
		String s3 = "Subha";
		String s4 = "Moni";
		
		int res1 = s1.compareTo(s2);
		System.out.println("Comparing 1st String "+s1+"with 2nd string "+s2+":"+res1);
		
		int res2 = s1.compareTo(s3);
		System.out.println("Comparing 1st String "+s1+"with 3rd string "+s2+":"+res2);
		
		int res3 = s1.compareTo(s4);
		System.out.println("Comparing 1st String "+s1+"with 4th string "+s2+":"+res3);
		
		int res4 = s3.compareTo(s4);
		System.out.println("Comparing 3rd String "+s3+"with 4th string "+s4+":"+res4);
		
		System.out.println("Concatinated string: "+s3.concat(s4));
		
	}

}
