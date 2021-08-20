package shweta_Bhosale;
class Employee {
String firstName = "Shweta";
String lastName = "Bhos";
int empId = 5034;
void display(){
System.out.println("Firstname is: "+ firstName);
System.out.println("Lastname is: "+ lastName);
System.out.println("Emp_Id is:" + empId);}
public static void main (String[] a){
	Employee e1= new Employee();
	e1.display();
}
}