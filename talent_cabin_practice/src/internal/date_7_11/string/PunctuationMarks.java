/**
 * 
 */
package internal.date_7_11.string;

import java.util.Scanner;

/**
 * @author OneStop
 *
 */
public class PunctuationMarks {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the desired String: ");
		String str = s.nextLine();
		PunctuationMarks obj = new PunctuationMarks();
		obj.countPunctuationMark(str);
	}
	
	public void countPunctuationMark(String pStr)
	{
		int count = 0;
		int length = pStr.length();
		
		for(int i=0;i<length;i++)
		{
			if(pStr.charAt(i) == ',' || pStr.charAt(i) == '.' || pStr.charAt(i) == '!' || pStr.charAt(i) == ';' || pStr.charAt(i) == '?')
			{
				count+=1;
			}
		}
		System.out.println("Total Punctuation Marks: "+count);
	}
}
