/*Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.*/

package suruchi.Assignment49;

public class Builder {

	String name;
	String gstNumber;
	int totalCompletedProject;
	int revenue;

	Builder(String name, String gstNumber, int totalCompletedProject, int revenue) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}

	public int hashCode() {
		int code = 0;
		char arr[] = this.name.toCharArray();
		for (int index : arr) {
			code += arr[index];
		}
		return code;
	}

	public boolean equals(Object obj) {
		Builder builder = (Builder) obj;
		return this.name.equals(builder.name) && this.gstNumber.equals(builder.gstNumber)
				&& this.revenue == builder.revenue;
	}
}