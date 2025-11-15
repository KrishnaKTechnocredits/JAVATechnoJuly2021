package swati.Assignment49;

public class Builder {
	String name,gstNumber;
	int totalCompletedProject;
	int revenue;
	
	public Builder(String name,String gstNumber,int totalCompletedProject,int revenue ){
		this.name=name;
		this.gstNumber=gstNumber;
		this.totalCompletedProject=totalCompletedProject;
		this.revenue=revenue;		
	}
	
	@Override
	public int hashCode() {
		char [] arr=this.name.toCharArray();
		int code=0;
		for(char ch:arr) {
			code=code+ch;
		}
		code=code&15;
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		Builder b1=(Builder)obj;
		return this.name.equals(b1.name)&& this.gstNumber.equals(b1.gstNumber) && this.revenue==b1.revenue;
		
	}
	
	@Override
	public String toString() {
		return name+"-"+gstNumber+"-"+totalCompletedProject+"-"+revenue;
	}
}

