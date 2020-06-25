/**
 * 
 */
package internal.string;

import java.util.Scanner;

/**
 * @author OneStop
 *
 */
public class ReplaceCharacters {

	public void replaceCharacters(String str)
	{
		//StringBuffer sb = new StringBuffer(String str);
		String replacestr = "@#&*$!";
		String replacedstr = str.replace(" ", replacestr);
		System.out.println(replacedstr);
		
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		ReplaceCharacters obj = new ReplaceCharacters();
		obj.replaceCharacters(str);

	}

}
