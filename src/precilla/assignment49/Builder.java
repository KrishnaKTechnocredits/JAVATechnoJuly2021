package precilla.assignment49;

public class Builder {
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
	public boolean equals(Object obj) {
		Builder b1=(Builder) obj;
		return this.name.equals(b1.name)&&this.gstNumber==b1.gstNumber&&this.Revenue==b1.Revenue;
		
	}
	@Override
	public int hashCode() {
		int code=0;
		char[] arr=this.name.toCharArray();
		for(char ch:arr) {
			code+=ch;
		}
		return code;
	}

}
