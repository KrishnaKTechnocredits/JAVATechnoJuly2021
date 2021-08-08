package prajwal;

class Employee
{
String empName="pra";
int empCode=034;
 
void display(){

    System.out.println("Employee name is" +empName);
    System.out.println("Employee code is" +empCode);
 }
 
public static void main(String[] a){
	
	Employee e1 = new Employee();
	e1.display();
 }
}
 