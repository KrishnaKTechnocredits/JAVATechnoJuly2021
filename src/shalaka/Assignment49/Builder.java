/*--------------------------------------------------------------------------------
Assignment - 49 : 10th Oct [hashCode & Equals]

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
package shalaka.Assignment49;

public class Builder {
	String builderName;
	String gstNo;
	int revenue;
	int totalCompletedProject;

	Builder(String name, String gstNo, int revenue, int totalCompletedProject) {
		this.builderName = name;
		this.gstNo = gstNo;
		this.revenue = revenue;
		this.totalCompletedProject = totalCompletedProject;
	}

	@Override
	public int hashCode() {
		int code = 0;
		char[] arr = this.builderName.toCharArray();
		for (char ch : arr) {
			code += ch;
		}
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		Builder builder = (Builder) obj;
		return this.builderName.equals(builder.builderName) && this.revenue == builder.revenue
				&& this.gstNo.equals(builder.gstNo);
	}

	public String toString() {
		return this.builderName + "-" + this.gstNo + "-" + this.revenue + "-" + this.totalCompletedProject;
	}

}
