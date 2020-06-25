/**
 * 
 */
package internal.collection.map.hashCollection;

/**
 * @author Shiwanjalee
 *
 */
public class Emp
{
	public String name, job;
	public int salary;
	
	/**
	 * @param name
	 * @param job
	 * @param salary
	 */
	public Emp(String n, String j, int s) {
		name = n;
		job = j;
		salary = s;
	}
	
	public void display()
	{
		System.out.println(name+"\t"+job+"\t"+salary);
	}
	
	public boolean equals(Object obj)
	{
		Emp e = (Emp) obj;
		return this.name.equals(e.name) && this.job.equals(e.job) && this.salary == e.salary;
	}

	public int hashCode()
	{
		return this.salary+ this.name.hashCode() + this.job.hashCode();
	}
}