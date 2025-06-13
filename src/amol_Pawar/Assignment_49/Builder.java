package amol_Pawar.Assignment_49;

public class Builder {

	String name, gstNumber;
	int totalCompletedProject, Revenue;
	public Builder(String name,String gstNumber,int totalCompletedProject,int Revenue )
	{
		this.name=name;
		this.gstNumber=gstNumber;
		this.totalCompletedProject=totalCompletedProject;
		this.Revenue=Revenue;
	}
	
	
	@Override
	public int hashCode() 
	{
		this.Revenue=Revenue;
		return  Revenue;
	}
	@Override
	public boolean equals(Object obj)
	{
		Builder o= (Builder)obj;
		if(this.name.equals(o.name) && this.Revenue==o.Revenue && this.gstNumber.equals(o.gstNumber))
		{
			return true;
		}
		return false;
		
	}
}
