package shreya_assignment_49;

public class Builder {
	String name;
	String gstNumber;
	int totalCompletedProject;
	int revenue;
	
	Builder(String name,String string,int totalCompletedProj,int revenue){
		this.name=name;
		this.gstNumber=string;
		this.totalCompletedProject=totalCompletedProj;
		this.revenue=revenue;
	}
	@Override
	public boolean equals(Object obj) {
		Builder b1=(Builder)obj;
		return this.name.equals(b1.name) && this.gstNumber==b1.gstNumber && this.revenue==b1.revenue;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
