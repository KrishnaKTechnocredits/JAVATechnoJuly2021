/* Assignment -4 : 4th Aug’21
Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.
1. Create class called “StudentInfo”
2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998), Address as String and rollNumber as int.
3. Create two methods called studentName() and studentOtherDetails()
4. studentName() method should print details like Name, middle name, surname.
5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
6. Create main method.
7. write a logic in main method.
           	a. Create object of StudentInfo class.
           	b. call studentName() and studentOtherDetails() method on reference variable
8. Compile & Run
*Output example: *
Shikha
Amit
Patel
10th Aug 1998
G-809, Heaven Apartment, Baner, Pune.
34
*/ 

package akanksha_Jain;

public class Assignment_4{
	String name, mName, sName, address, birthday;
	int rNo;

	void studentName(String name, String mName, String sName){
		System.out.println(name);
		System.out.println(mName);
		System.out.println(sName);
	}

	void studentOtherDetails(String birthday, String address, int rNo){
		System.out.println(birthday);
		System.out.println(address);
		System.out.println(rNo);
	}

	public static void main(String[] args){
		Assignment_4 studentInfo = new Assignment_4();
		studentInfo.studentName("Shikha", "Amit", "Patel");
		studentInfo.studentOtherDetails("10th Aug 1998", "G-809, Heaven Apartment, Baner, Pune.", 34);
	}
}
