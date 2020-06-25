package internal.date_02_12.syncronization;

public class Printer1 
{
	/**
	 * To set the message to be printed for 3 stages. 1st header, 2nd is the message
	 * and the last is the footer. And after each stage the Thread is suspended for
	 * half second.
	 * 
	 * @param msg
	 */
	public synchronized static void print(String msg) {
		System.out.println("=================");
		try {
			Thread.sleep(500);
			System.out.println(msg);
			Thread.sleep(500);
			System.out.println("*****************");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class User extends Thread {
	Printer1 tPrinter;
	String tMsg;

	public User(Printer1 p, String m) {
		tPrinter = p;
		tMsg = m;
	}

	public void run() {
		Printer1.print(tMsg);
	}
}

class SharedResource {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Printer1 p = new Printer1();
		User u1 = new User(p, "Its 1st user");
		User u2 = new User(p, "Its 2nd user");

		u1.start();
		u2.start();
	}
}
