package manaswi;

public class Assignment_4
{
	String name= "Manaswi";
	String midname= "Mahadev";
	String surname= "Humbe";
	String birthdate= "10th Oct 1996";
	String address= "RadhaKrushna colony, Vasant Vihar, Solapur";
	int rno= 1;
	
	void studentName()
	{
	    System.out.println(name);
	    System.out.println(midname);
	    System.out.println(surname);
	}

	void studentOtherDetails()
	{
	    System.out.println(birthdate);
	    System.out.println(address);
	    System.out.println(rno);
	}

	public static void main (String[] args)
	{
	    Assignment_4 studentInfo = new Assignment_4();
	    studentInfo.studentName();
	    studentInfo.studentOtherDetails();
	}
}