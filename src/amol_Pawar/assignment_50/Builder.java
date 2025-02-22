package amol_Pawar.assignment_50;


public class Builder implements Comparable<Builder>{

	String name, gstNumber;
	int totalCompletedProject, Revenue;
	
	Builder(String name,String gstNumber,int totalprojects,int Revenue)
	{
		this.name=name;
		this.gstNumber=gstNumber;
		this.totalCompletedProject=totalprojects;
		this.Revenue=Revenue;
	}
	@Override
	public int compareTo(Builder builder)
	{
		return this.Revenue-builder.Revenue;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", Revenue=" + Revenue + "]";
	}
	
	
}
