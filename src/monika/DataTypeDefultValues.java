package monika;
class DataTypeDefultValues{
	
	byte b; // 1 byte
	short s; //2 byte
	int i; //4 byte
	long l;
	float f;
	boolean flag;
	char ch;
	String str;
	
	void printDefaultValues(){
		System.out.println("Byte="+b);
		System.out.println("Short="+s);
		System.out.println("Integer="+i);
		System.out.println("Long="+l);
		System.out.println("Float="+f);
		System.out.println("Boolean="+flag);
		System.out.println("Character="+ch+"st");
		System.out.println("String="+str);
		
		
	}
	void printLocalDefaultValues(){
		byte b=0;
		System.out.println("Byte="+b);
	}
	public static void main(String[] args){
		DataTypeDefultValues dataTypeDefultValues=new DataTypeDefultValues();
		dataTypeDefultValues.printDefaultValues();
		dataTypeDefultValues.printLocalDefaultValues();
	}
}