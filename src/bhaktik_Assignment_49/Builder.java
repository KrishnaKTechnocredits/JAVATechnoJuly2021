/*Assignment - 49 : 10th Oct [hashCode & Equals]

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.*/

package bhaktik_Assignment_49;

public class Builder {
	
	String name;
	String gstNum;
	int totalCompletedProject;
	int revenue;
	
	Builder(String name,String gstNum, int totalCompletedProject,int revenue ){
		this.name= name;
		this.gstNum = gstNum;
		this.totalCompletedProject= totalCompletedProject;
		this.revenue= revenue;
	}
	
	public String toString (){
		return this.name+"-"+this.gstNum+" " ;
	}			
	
	@Override
	public 	int hashCode(){
		int code=0;	
		 char ch[]=this.gstNum.toCharArray();
		 for (char c: ch) {
			 code+=c;
		 }
		 code = code&15;
		return code;
	}
	@Override
	public boolean equals(Object o) {
		Builder b= (Builder) o; 
		return this.name.equals(b.name) && this.revenue== b.revenue && this.gstNum.equals(b.gstNum);
 
	}

}
