/**
 * 
 */
package internal.ducatPrograms.exceptionhandling;

/**
 * @author ssuman
 *
 */
class Divider {

	/**
	 * @param Exception example
	 */
	public static void main(String[] args) 
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("Result is: "+c);
			
			/*Scanner s = new Scanner(System.in);
			System.out.println("Enter the 1st no: ");
			int a = s.nextInt(Integer.parseInt(args[0]));
					//Integer.parseInt(args[0]);
			//int b = Integer.parseInt(args[1]);
			int b = s.nextInt(Integer.parseInt(args[1]));
			int c = a/b;
			System.out.println("Result is: "+c);*/
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("2nd no must be non- zero");
		}
		catch (NumberFormatException e) 
		{
			System.out.println("i/o must be numberic.");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("No i/p is provided.");
		}
	}
}
