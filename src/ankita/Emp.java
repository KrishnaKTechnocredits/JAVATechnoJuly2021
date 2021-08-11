package ankita;
class Emp{
	String empFName="Techno";
	String empLName="Credit";
	int empid=1;
	
	void displyInfo(){
		System.out.println(empFName);
		System.out.println(empLName);
		System.out.println(empid);
		}
		
	public static void main(String[] args){
		Emp e1=new Emp();
		e1.displyInfo();
		
	}
}
			   