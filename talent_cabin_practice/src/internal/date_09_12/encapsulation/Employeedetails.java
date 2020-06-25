/**
 * 
 */
package internal.date_09_12.encapsulation;

/**
 * @author Shiwanjalee
 *
 */
class Employeedetails 
{
	private int id;
	private int age;
	private String name;
	
	
	/**
	 * generating pojo for ID
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * generating pojo for Age
	 * @return
	 */
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * generating pojo for Name
	 * @return
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static class EncapsTest
	{
	    public static void main(String args[])
	    {
	    	Employeedetails obj = new Employeedetails();
	        obj.setId(101);
	        obj.setAge(22);
	        obj.setName("Shivy");
	         System.out.println("Employee Name: " + obj.getName());
	         System.out.println("Employee ID: " + obj.getId());
	         System.out.println("Employee Age: " + obj.getAge());
	    } 
	}
}
