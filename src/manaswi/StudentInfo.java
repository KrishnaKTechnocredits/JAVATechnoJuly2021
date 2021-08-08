package manaswi;

class StudentInfo
{
	void stdName(String name,String middlename,String surname)
	{
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	void stdOtherDetails(String birthdate,String adress, int rollnumber)
	{	
		System.out.println(birthdate);
		System.out.println(adress);
		System.out.println(rollnumber);
	}
	public static void main (String [] args)
	{
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.stdName("Diva","prakash","Patil");
		studentInfo.stdOtherDetails("10 March ,2002","53,RadhaKrushna Colony,Solapur",15);
	}
}
	