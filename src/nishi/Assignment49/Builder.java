package nishi.Assignment49;

public class Builder {
	String name;
	String gstNumber;
	int totalCompletedProject;
	double revenue;
	public Builder(String name, String gstNumber, int totalCompletedProject, double revenue) {
		
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}
	@Override
	public int hashCode()
	{
		int code=0;
		char[] arr=this.gstNumber.toCharArray();
		for(char c:arr)
		{
			code+=c;
		}
		return code;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Builder b1=(Builder)obj;
		return this.name.equals(b1.name) & this.gstNumber.equals(b1.gstNumber) & this.revenue==b1.revenue;
	}
	
}
