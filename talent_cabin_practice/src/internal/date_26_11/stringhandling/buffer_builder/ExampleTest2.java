/**
 * 
 */
package internal.date_26_11.stringhandling.buffer_builder;

/**
 * @author Shiwanjalee
 *
 */
public class ExampleTest2 {

	/**
	 * String Buffer methods
	 */
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("S.Shiwanjalee");
		System.out.println(sb1);  //S.Shiwanjalee
		
		sb1.insert(1,"uman");
		System.out.println(sb1);  //Suman.Shiwanjalee
		
		sb1.delete(5, 17);
		System.out.println(sb1);  //Suman
		
		sb1.reverse();
		System.out.println(sb1);  //namuS
		
		StringBuffer sb2 = new StringBuffer("Impossible!!");
		System.out.println(sb2);  //Impossible!!
		
		sb2.replace(0, 2, "I'm ");
		System.out.println(sb2);  //I'm possible!!
		
		
		
	}

}
