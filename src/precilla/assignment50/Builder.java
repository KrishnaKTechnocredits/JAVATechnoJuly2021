package precilla.assignment50;


public class Builder implements Comparable<Object> {
	String name="";
	int gstNumber=0;
	int totalCompletedProject=0;
	int Revenue=0;
	
	Builder(String name,int gst,int total,int revenue){
		this.name=name;
		this.gstNumber=gst;
		this.totalCompletedProject=total;
		this.Revenue=revenue;
	}
	@Override
	public String toString() {
		return name+" : "+Revenue;
	}
	
	
	public int compareTo(Object obj){
		Builder b1=(Builder) obj;
		return this.Revenue-b1.Revenue;
	}
	

}
