/**
 * 
 */
package internal.date_06_12.abstraction;

/**
 * @author Shiwanjalee
 *
 */
public class BankTest {

	/**
	 * To get the interest of all the bank
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Bank bankobj;
		bankobj = new SBI();
		System.out.println("Interest of SBI:"+bankobj.interst()+"%");
		
		bankobj = new Axis();
		System.out.println("Interest of Axis:"+bankobj.interst()+"%");
		
		bankobj = new HDFC();
		System.out.println("Interest of HDFC:"+bankobj.interst()+"%");
	}
}
