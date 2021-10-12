package pritihascode_Equals;
public class Builder{
	String name;
	String gstNumber;
	int totalCompletedProject;
	int Revenue;
	
	Builder(String name, String gstNumber, int totalCompletedProject, int Revenue){
		this.name= name;
		this .gstNumber = gstNumber;
		this.totalCompletedProject= totalCompletedProject;
		this.Revenue= Revenue;
	}
	@Override
	public String toString() {
		return name +"-"+gstNumber+"-"+"-"+Revenue+"-"+totalCompletedProject;
	}
	@Override
	public int hashCode() {
		int code=0;
		char[] arr= this.gstNumber.toCharArray();
		for (char ch :arr) {
			code= code+ch;
		}
		code = code &15;
		return code;
	}
	
	/*@Override
	public int hashCode() {
		int code = 0;
		char[] arr = this.gstNumber.toCharArray();
		for(char ch : arr) {
			code += ch;
		}
		code = code & 15; // 0-15
		return code;
	}*/
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		Builder b1 = (Builder)obj;
		 return this.gstNumber.equals(b1.gstNumber)&& this.name.equals(b1.name) && ((this.Revenue-b1.Revenue)==0)  ;	 
			 
		 		
	}
	
	
	
}

	/*Assignment - 49 : 10th Oct [hashCode & Equals]
	 * Create a class call builder.
	-> builder has 4 attributes
	-> name, gstNumber, totalCompletedProject, Revenue
	-> pass parameter values while object creation.

	Create a client class.
	-> create 5 objects of builder class by passing values to constructor.
	-> all parameters are same for 2 objects
	-> Create a set and return only unique builder information.
	 -> uniqueness should be based on name, gstNumber, Revenue.
	-> Expected answer is - 4.*/
	
	
	
	
	


