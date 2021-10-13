/* Assignment - 49 : 10th Oct [hashCode & Equals]
Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.
Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4. */

package akanksha_Jain.Assignment_49;

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