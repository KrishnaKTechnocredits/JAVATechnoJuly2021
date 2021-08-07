package nidhi;

class Student
{
	String name = "Nidhi";
	int rno = 1;
	
	void display()
	{
		System.out.println(name);
		System.out.println(rno);
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.display();
	}
}