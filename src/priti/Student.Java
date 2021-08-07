// student has name and Roll no, it should be printed

class Student {
	String name = "Prit";
	int rno = 1;
	String lastName = "Vattanavar";
	int salary= 100000;
	
	void displayInfo () {
		System.out.println ("\"Student Name\" is  " + name);
		System.out.println ("Student rno is " + rno);
		}
		
	void showInfo (){
		System.out.println ("Student Last Name is  " + lastName);
		System.out.println ("Student salary is "+ salary);
		}
		public static void main(String[] a) {
			Student s1 = new Student();
			Student s2 = new Student ();
			System.out.println(s1);
			s1.displayInfo();
			s2.showInfo();
			System.out.println(s1.rno);
		}
}