/**
 * 
 */
package internal.string;

import java.util.Scanner;

/**
 * @author OneStop
 *
 */
public class ReverseString {
	public void reverseString(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String reverse = "";
		int n = str.length();
		for(int i=n-1; i>=0; i--)
		{
			reverse = reverse+str.charAt(i);
		}
		System.out.println("Reversed string: "+reverse);
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		ReverseString obj = new ReverseString();
		obj.reverseString(str);

	}

}
