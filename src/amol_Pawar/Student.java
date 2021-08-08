package amol_Pawar;
class Student
{
	String stdName="techno";
	int rno=1;

	void displayinfo(){
		System.out.println(stdName);
		System.out.println(rno);
	}
	
	public static void main(String[] args)
	{
		Student s=new Student();
		s.displayinfo();
	}
}