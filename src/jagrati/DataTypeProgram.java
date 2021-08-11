package jagrati;

public class DataTypeProgram{
	int x; //// 4 byte 
	short y; //2 byte 
	byte z; // 1 byte 
	long l;// 8 byte 
	float f;// 4 byte decimal value
	double d;//8 byte decimal value
	boolean bo; // 1byte 
	char ch;// 2byte   "primitive data type- we can calculate how much memory used in byte"
	String str; //"non primitive data type "- not fixed size 
	
	void displayInfo(){
	
		System.out.println("Default value of int " + x);
		System.out.println("Default value of short " +y);
		System.out.println("Default value of byte " +z);
		System.out.println("Default value of float " +f);
		System.out.println("Default value of double" +d);
		System.out.println("Default value of boolean " +bo);
		System.out.println("Default value of char " +""+ch+"");
		System.out.println("Default value of string " + str);				
	}
	void printDefaultvlaue(){
		int x = 10; // local variable do not have deafult value
		x = x + 10;
		System.out.println("Deafut vlaue of int " + x);		
	}
	
	public static void main(String [] a){
		DataTypeProgram dtp = new DataTypeProgram();
		dtp.printDefaultvlaue();
		dtp.displayInfo();
		
	}
	

}