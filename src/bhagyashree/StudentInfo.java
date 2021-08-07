//To print student info by creating 2 methods in one class
package bhagyashree;
class StudentInfo
{
	String firstName,middleName,lastName,address,birthDate;
	int rollNo;
	
	void studentName(String fname,String mname,String lname)
	{
		firstName=fname;
		middleName=mname;
		lastName=lname;
		System.out.println("Firstname:  "+ firstName +  "   Middlename:  " + middleName +  "   Lastname:  "+lastName);
	}
	
	void studentOtherInfo(String birthday,int rno,String add)
	{
		birthDate=birthday;
		rollNo=rno;
		address=add;
		System.out.println("Birthdate:  "+ birthDate +  "  Roll No:  "+ rollNo +  "   Address:"+address);
	}
	
	public static void main(String[] args)
	{
		StudentInfo studinfo=new StudentInfo();
		studinfo.studentName("Bhagyashree","Madhav","Shirude");
		
		studinfo.studentOtherInfo("20-05-1991",10378,"c-402,Millenium acropolis,Wakad,Pune ");
		
	}
}