package amol_Vyas;

class StudentDetails{

	void studentInfo(String firstName , String middleName , String surname){
        System.out.println("Student first name is " + firstName);
        System.out.println("Student middle name is " + middleName);
        System.out.println("Studnnet surname is " + surname);
    }
   
    void studentOtherDetails(String dateOfBirth , String stuAddress ,int rollNo){
        System.out.println("Student date of birth is " + dateOfBirth);
        System.out.println("Student address is " + stuAddress);
        System.out.println("Student rollno is " + rollNo);
    }
   
    public static void main(String[] a){
        StudentDetails studentDetails = new StudentDetails();
        studentDetails.studentInfo("Ram" , "Singh" ,"Thakur");
        studentDetails.studentOtherDetails("10th Aug 1988" , "G-809, Heaven Apartment, Baner, Pune" , 23);
    }
}