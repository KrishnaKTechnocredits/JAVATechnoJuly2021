
package dattaraj.dattaraj_Assignment_49;

public class Assignment_49_Builder {

	String name;
	int gstNumber;
	int totalCompletedProject;
	int revenue;
	
	public Assignment_49_Builder(String name, int gstNumber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Assignment_49_Builder b1 = (Assignment_49_Builder) obj;
		return (this.name.equals(b1.name) && (this.gstNumber==b1.gstNumber) && (this.revenue==b1.revenue));
	}

	public int hashCode()
	{
		int code=0;
		char[] ch = this.name.toCharArray();
		for(char c:ch)
		{
			code += c;
		}
		return code;
	}
	
	@Override
	public String toString() {
		return name + "-" +  gstNumber + "-" + revenue + "-" + totalCompletedProject;
	}
}