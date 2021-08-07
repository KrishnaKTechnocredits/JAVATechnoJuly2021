
class Studentinfo{
	String name,mname,surname,address,dob;
	int rno;
	
	void studentName(String name,String mname,String surname){
	
		System.out.println("Student name is " +name);
		System.out.println("Student middle name is " + mname);
		System.out.println("Student surname is " + surname);

		}
	void studentOtherDetails(int rno,String dob,String address){
	
		System.out.println("Student rollno is " + rno);
		System.out.println("Student DOB is " + dob);
		System.out.println("Student address is " +address);
		}	
		
	public static void main(String[] args){
		Studentinfo studentinfo=new Studentinfo();
		studentinfo.studentName("Ankita","Vinod","Kene");
		studentinfo.studentOtherDetails(1,"27 Nov 1997","Amt");
		
	}
	}
			   