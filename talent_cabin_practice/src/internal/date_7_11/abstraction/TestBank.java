/**
 * 
 */
package internal.date_7_11.abstraction;

import java.util.Scanner;

/**
 * @author OneStop
 *
 */
public class TestBank {

	/**
	 * @param To calculate the rate of interest
	 */
	public static void main(String[] args) 
	{
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the Bank Name: ");
		int rateOfInterestSbi = s.nextInt();
		System.out.println("Enter the Interest Rate of BOI: ");
		int rateOfInterestBoi = s.nextInt();*/
		Bank bank;
		bank = new SBI();
		System.out.println("The Rate of interest of SBI is :"+bank.rateOfInterest()+ "%");
		bank = new BOI();
		System.out.println("The Rate of interest of BOI is :"+bank.rateOfInterest()+ "%");
	}
}
