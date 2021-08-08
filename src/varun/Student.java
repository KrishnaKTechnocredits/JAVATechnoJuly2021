// Student has a name and roll no and we have to print those.
package varun;

class Student {
	String stdName = "Varun";
	int rollNo = 119;

	void displayStdInfo() {
		System.out.println(stdName);
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.displayStdInfo();
	}
}