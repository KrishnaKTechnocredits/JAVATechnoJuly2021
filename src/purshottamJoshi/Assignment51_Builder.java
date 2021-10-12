package purshottamJoshi;

public class Assignment51_Builder {
	
	String name;
	String gstNumber;
	int totalCompletedProject;
	int revenue;
	
	public Assignment51_Builder(String name, String gstNumber, int totalCompletedProject, int revenue) {
		this.name=name;
		this.gstNumber=gstNumber;
		this.totalCompletedProject=totalCompletedProject;
		this.revenue=revenue;
		
	}
	
	@Override
	public String toString() {
		return name +  " " + revenue + " "  + totalCompletedProject ;
	}


}
