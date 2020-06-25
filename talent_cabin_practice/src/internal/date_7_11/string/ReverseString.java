/**
 * 
 */
package internal.date_7_11.string;

import java.util.Scanner;

/**
 * @author OneStop
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the original String: ");
		String str = s.nextLine();
		ReverseString obj =  new ReverseString();
		obj.reverseString(str);
	}
	
	public void reverseString(String pStr)
	{
		StringBuffer sb = new StringBuffer(pStr);
		sb.reverse();
		String rev = "";
		int lengh = pStr.length();
		
		for(int i= lengh-1; i>=0;i--)
		{
			rev = rev+pStr.charAt(i);
		}
		System.out.println("The reversed string: "+rev);
	}

}
