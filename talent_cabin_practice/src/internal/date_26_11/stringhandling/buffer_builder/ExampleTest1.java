/**
 * 
 */
package internal.date_26_11.stringhandling.buffer_builder;

import java.util.Scanner;

/**
 * @author Shiwanjalee
 *
 */
public class ExampleTest1 
{
	public void display(String str)
	{
		System.out.println(str);
		System.out.println("After concating string: "+str.concat("Face."));
	}
	
	public void display(StringBuffer sb)
	{
		System.out.println(sb);
		System.out.println("After appending string: "+sb.append("ing..."));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = input.nextLine();
		
		System.out.println("Enter the String: ");
		StringBuffer stbuff = new StringBuffer(input.nextLine());
		
		ExampleTest1 obj = new ExampleTest1();
		obj.display(str);
		obj.display(stbuff);
	}
}
