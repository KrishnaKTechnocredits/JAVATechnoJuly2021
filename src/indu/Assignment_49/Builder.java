/*ssignment - 49 : 10th Oct [hashCode & Equals]

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.*/
package indu.Assignment_49;

public class Builder {

	String name;
	String gstNumber;
	int totalCompleteProjects;
	int revenue;
	
	Builder(String name,String gstNumber,int totalCompleteProjects,int revenue)
	{
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompleteProjects = totalCompleteProjects;
		this.revenue= revenue;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Builder b1 = (Builder) obj;
		return (this.name.equals(b1.name) && this.gstNumber.equals(b1.gstNumber) && (this.revenue==b1.revenue));
		
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
	
	public String toString()
	{
		return "\nName : "+name +" GstNumber : "+gstNumber + " TotalCompleteProject : "+totalCompleteProjects+" Revenue : "+revenue;
		
	}
}
