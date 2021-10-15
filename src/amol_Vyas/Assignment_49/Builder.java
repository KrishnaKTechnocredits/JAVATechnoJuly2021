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

package amol_Vyas.Assignment_49;

public class Builder {

	String name, gstNumbber;
	int totalCompletedProject, revenue;

	public Builder(String name, String gstNumbber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumbber = gstNumbber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return name + " " + gstNumbber + " " + totalCompletedProject + " " + revenue;
	}

	@Override
	public int hashCode() {
		int code = 0;
		char[] ch = this.name.toCharArray();
		for (int num : ch) {
			code += num;
		}
		code = code & 15;
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		Builder builder = (Builder) obj;
		return this.gstNumbber.equals(builder.gstNumbber) && this.name.equals(builder.name)
				&& this.revenue == builder.revenue;
	}
}
