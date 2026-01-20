package precilla.assignment51;
import java.util.Comparator;


public class Builder implements Comparator<Builder>{
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
		return this.name+ " : "+this.Revenue + " : "+this.totalCompletedProject;
	}
	
	@Override
	public int compare(Builder b1,Builder b2) {
		return b1.Revenue-b2.Revenue;
	}
	
	
}
