package gauravk.Assignment_49;
/*
 * Assignment - 49 : 10th Oct [hashCode & Equals]

Create a class call builder.
-> builder has 4 attributes
-> name, GSTNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, GSTNumber, Revenue.
-> Expected answer is - 4.
-----------------------------------------------------------------------
 */
public class Builder {
	String name;
	String GSTNumber;
	int totalCompletedProject;
	int revenue;
	
	Builder(String name, String GSTNumber, int totalCompletedProject, int revenue){
		this.name = name;
		this.GSTNumber = GSTNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}
	
	@Override
	public int hashCode() {
		char ch;
		int hashCode = 0;
		for (int index = 0; index < GSTNumber.length();index++) {
			ch = GSTNumber.charAt(index);
			hashCode += ch;
		}
		return hashCode;
	}
	
	@Override
	public String toString() {	
		return (name + hashCode());
	}
	
	@Override
	public boolean equals(Object obj) {
		Builder newObj = (Builder) obj;
		if ((this.name.equals(newObj.name) && this.GSTNumber.equals(newObj.GSTNumber)) && (this.revenue == newObj.revenue))
			return true;
		return false;
	}
}
