package amol_Pawar.assignment_51;

public class Builder {
	String name, gstNumber;
	int totalCompletedProject, Revenue;
	
	Builder(String name,String gstNumber,int totalCompletedProject, int Revenue)
	{
		this.name=name;
		this.gstNumber=gstNumber;
		this.totalCompletedProject=totalCompletedProject;
		this.Revenue=Revenue;
	}
	@Override
	public String toString()
	{
		return "[" + "Name="+name +", Revenue= "+Revenue +", TotalProject= "+totalCompletedProject+"]";
	}
}
