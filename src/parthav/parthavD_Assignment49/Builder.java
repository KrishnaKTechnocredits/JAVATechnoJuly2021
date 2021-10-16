package parthav.parthavD_Assignment49;

public class Builder {
	
	String name;
	String gstNumber;
	int totalCompletedProject;
	int revenue;
	
	Builder(String name, String gstNumber, int totalCompletedProject, int revenue){
		this.name = name;
		this.gstNumber = gstNumber;
		this.totalCompletedProject = totalCompletedProject;
		this.revenue = revenue;
	}
	
	@Override
	public int hashCode() {
		char ch;
		int hashCode = 0;
		for (int index = 0; index < gstNumber.length();index++) {
			ch = gstNumber.charAt(index);
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
		if ((this.name.equals(newObj.name) && this.gstNumber.equals(newObj.gstNumber)) && (this.revenue == newObj.revenue))
			return true;
		return false;
	}
	

}
