/*Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.*/

package manaswi;

public class Builder 
{
	String name;
	int gstNumber;
	int totalCompletedProject;
	int revenue;

	Builder(String name,int gstNum,int totalCompletedProj,int revenue)
	{
		this.name=name;
		this.gstNumber=gstNum;
		this.totalCompletedProject=totalCompletedProj;
		this.revenue=revenue;
	}
	@Override
	public boolean equals(Object obj)
	{
		Builder b1=(Builder)obj;
		return this.name.equals(b1.name) && this.gstNumber==b1.gstNumber && this.revenue==b1.revenue;
	}

	@Override
	public int hashCode()
	{
		int code=0;
		char[] arr=this.name.toCharArray();
		for(char ch:arr) 
		{
			code+=ch;
		}
		return code;
	}
}