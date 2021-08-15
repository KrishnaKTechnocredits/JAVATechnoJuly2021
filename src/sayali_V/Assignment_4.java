package sayali_V;

public class Assignment_4 
{

	void studentName(String name,String middlename,String surname)
	{
		System.out.println("student name is: "  +name );
		System.out.println("middlename: " +middlename);
		System.out.println("surname: "  +surname);
	}
	void studentOtherDetails(String birthdate,String address,int rollNumber)
	{
		System.out.println("student birthdate is: "  + birthdate);
		System.out.println("address : "    + address);
		System.out.println("rollNumber:  "  + rollNumber);
	}
	
	public static void main(String args[])
	{
		Assignment_4 assignment4=new Assignment_4();
		assignment4.studentName("shikha","amit","patel");
		assignment4.studentOtherDetails("10th Aug 1998","G-108,Heaven Apartment,Baner,Pune",34);
	}

}

